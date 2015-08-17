# gwt-clientbundle
Demonstrate Eclipse missing resource error

This project is a slight modification of the GWT "Getting Started" project (http://www.gwtproject.org/gettingstarted.html). Its purpose is to demonstrate the error described in gwt-eclipse-plugin issue #87 (https://github.com/gwt-plugins/gwt-eclipse-plugin/issues/87).

I have added a small PNG icon to the display, and identified this icon in ImageResources.java. The source, `@Source ("com/mycompany/mywebapp/public/images/logo-gwt.png")`, gets the error *Resource file logo-gwt.png is missing (expected at com/mycompany/mywebapp/public/images)* if the project property *Properties for MyWebApp -> Google Classic -> GWT Classic -> Use Google Web Toolkit* is checked. This happens where I am using the SDK from `/opt/2.7.0` (from the `gwt-2.7.0.zip` file) or the plugin at `/Applications/eclipse/Eclipse.app/Contents/Eclipse/plugins/com.google.gwt.eclipse.sdkbundle_0.0.0.201508031545`. Unchecking *Use Google Web Toolkit* removes the error.

Note that the PNG is in `[my-module]/public`, not `[my-module]/client`. The Java build path includes all files in `src` so the resource should be picked up.
