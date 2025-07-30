package uz.ismoilfozil.nativeiosincompose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.UIKitViewController

@Composable
actual fun NativeButton(onClick: () -> Unit, modifier: Modifier) {
    val factory = LocalNativeViewFactory.current
    UIKitViewController(
        modifier = modifier,
        factory = {
            factory.createButtonView(
                label = "Click me!",
                onClick = onClick
            )
        }
    )
}