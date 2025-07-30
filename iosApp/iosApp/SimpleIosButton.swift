//
//  SimpleIosButton.swift
//  iosApp
//
//  Created by Ismoil Foziljonov on 28/07/25.
//

import SwiftUI
import ComposeApp

class IOSNativeViewFactory : NativeViewFactory {
    static var shared = IOSNativeViewFactory()
    func createButtonView(label: String, onClick: @escaping () -> Void) -> UIViewController {
        let view = SimpleIosButton(label: label, action: onClick)
        return UIHostingController(rootView: view)
    }
    
    
}

struct SimpleIosButton : View {
    
    var label:String
    var action:() -> Void
    
    var body: some View {
        Button(action: action){
            Text(label)
                .font(.headline)
        }
    }
}
