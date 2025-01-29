# Connection Indicator

[![Gradle Package](https://github.com/burhancabiroglu/connection-indicator/actions/workflows/gradle-publish.yml/badge.svg)](https://github.com/burhancabiroglu/connection-indicator/actions/workflows/gradle-publish.yml)

**Connection Indicator** is a lightweight Android library designed to provide a seamless way to display network connection status in your application. Built with Jetpack Compose, this library offers a modern, declarative approach to UI development.

---

## Features

- Easy-to-integrate UI indicator with Jetpack Compose.
- Fully customizable appearance.
- Lightweight and efficient.

---

## Installation

To use **Connection Indicator** in your Android project, add the following dependency to your `build.gradle.kts` file:


For Gradle(build.gradle.kts):

```gradle
implementation("com.cabir:connectionindicator:1.0.0-SNAPSHOT")
```

settings.gradle.kts:

```gradle
dependencyResolutionManagement {
    repositories {
        maven(url = "https://maven.pkg.github.com/burhancabiroglu/connection-indicator")
    }
}
```
---

## Usage

### Basic Setup

1. Add the `ConnectionIndicator` composable to your Jetpack Compose UI:

```kotlin
import com.cabir.connectionindicator.component.ConnectionIndicator
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyApp() {
    Box(modifier = Modifier.fillMaxSize()) {
        ConnectionIndicator()
    }
}
```

### Customization

You can customize the appearance and behavior of the indicator by modifying the parameters of the `ConnectionIndicator` composable:

```kotlin
ConnectionIndicator(
    level = 3,
    barCount = 5,
    height = 24.dp,
    barWidth = 4.dp,
    barGap = 2.dp,
    activeColor = Color.Green,
    inactiveColor = Color.Gray
)
```

## Screenshots

Here is an example of the connection indicator in action:

![Connection Indicator](./art/sample.png)

---

## License

This project is licensed under the [Apache License 2.0](https://github.com/burhancabiroglu/connection-indicator/blob/main/LICENSE).

---

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes with clear and concise messages.
4. Create a pull request.

For major changes, please open an issue first to discuss what you would like to change.

---

## Support

If you encounter any issues or have questions, feel free to open an [issue](https://github.com/burhancabiroglu/connection-indicator/issues) or contact me directly.

---

## Author

Developed by **Burhan Cabiroglu**. You can find me on [GitHub](https://github.com/burhancabiroglu) or connect with me on [LinkedIn](https://linkedin.com/in/burhancabiroglu).

---

## Changelog

See the [CHANGELOG](https://github.com/burhancabiroglu/connection-indicator/blob/main/CHANGELOG.md) for details about updates and changes.

