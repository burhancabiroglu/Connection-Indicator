package com.cabir.connectionindicator.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.cabir.connectionindicator.theme.ConnectionIndicatorDefaults

/**
 * A Composable function that displays a connection strength indicator.
 *
 * @param modifier Modifier to be applied to the Canvas.
 * @param level Current connection level (e.g., 3 out of 4 bars active).
 * @param barCount Number of bars in the indicator.
 * @param height Height of the indicator.
 * @param barWidth Width of each bar.
 * @param barGap Space between bars.
 * @param activeColor Color of active bars.
 * @param inactiveColor Color of inactive bars.
 */
@Composable
fun ConnectionIndicator(
    modifier: Modifier = Modifier,
    level: Int = 3,
    barCount: Int = 4,
    height: Dp = ConnectionIndicatorDefaults.HEIGHT,
    barWidth: Dp = ConnectionIndicatorDefaults.BAR_WIDTH,
    barGap: Dp = ConnectionIndicatorDefaults.BAR_GAP,
    activeColor: Color = ConnectionIndicatorDefaults.BAR_COLOR_ACTIVE,
    inactiveColor: Color = ConnectionIndicatorDefaults.BAR_COLOR_INACTIVE
) {
    val calculatedWidth = (barWidth + barGap) * barCount + (barCount + 1).dp
    Canvas(
        modifier
            .offset(y = (-1 * height.value / 8).dp)
            .height(height)
            .width(calculatedWidth)
    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        val barWidthPx = barWidth.toPx()
        val minHeight = canvasHeight / 6f
        val stepWidth = canvasWidth / barCount
        val stepHeight = (canvasHeight - minHeight) / barCount

        for (i in 0..<barCount) {
            val endY = minHeight + stepHeight * i
            val startX = barWidthPx / 2 + 2f
            drawLine(
                start = Offset(x = (i * stepWidth) + startX, y = canvasHeight),
                end = Offset(x = (i * stepWidth) + startX, y = canvasHeight - endY),
                color = if (i < level) activeColor else inactiveColor,
                cap = StrokeCap.Round,
                strokeWidth = barWidthPx
            )
        }
    }
}

@Preview
@Composable
private fun ConnectionIndicator_Preview() {
    MaterialTheme {
        ConnectionIndicator()
    }
}