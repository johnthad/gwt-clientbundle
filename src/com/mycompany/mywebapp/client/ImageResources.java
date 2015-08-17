package com.mycompany.mywebapp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface ImageResources extends ClientBundle {
  public static final ImageResources INSTANCE = GWT.create(ImageResources.class);
  
  @Source ("com/mycompany/mywebapp/public/images/logo-gwt.png")
  public ImageResource gwtLogo();
}
