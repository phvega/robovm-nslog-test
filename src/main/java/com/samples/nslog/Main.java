package com.samples.nslog;

import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.*;

public class Main extends UIApplicationDelegateAdapter {
    @Override
    public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
        // Set up the view controller.
        MyViewController rootViewController = new MyViewController();

        // Create a new window at screen size.
        UIWindow window = new UIWindow(UIScreen.getMainScreen().getBounds());
        // Set the view controller as the root controller for the window.
        window.setRootViewController(rootViewController);
        // Make the window visible.
        window.makeKeyAndVisible();

        return true;
    }

    public static void main(String[] args) {
        try (NSAutoreleasePool ignored = new NSAutoreleasePool()) {
            UIApplication.main(args, null, Main.class);
        }
    }
}
