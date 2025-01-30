package com.cabir.componentlib

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cabir.componentlib.ui.theme.MyApplicationTheme
import com.cabir.connectionindicator.component.ConnectionIndicator
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                ExampleScreen()
            }
        }
    }
}

@Composable
fun ExampleScreen() {
    var level by remember { mutableIntStateOf(1) }
    val barCount = 4
    LaunchedEffect(Unit) {
        repeat(barCount) {
            delay(2000)
            level++

        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        ConnectionIndicator(
            level = level,
            barCount = barCount,
            barWidth = 12.dp,
            height = 100.dp
        )
    }
}