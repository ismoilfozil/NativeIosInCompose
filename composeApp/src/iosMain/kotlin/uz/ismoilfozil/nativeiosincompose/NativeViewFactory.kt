package uz.ismoilfozil.nativeiosincompose

import platform.UIKit.UIViewController

interface NativeViewFactory {
    fun createButtonView(
        label: String,
        onClick: () -> Unit
    ): UIViewController
}