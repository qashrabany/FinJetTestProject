package com.finjet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MasterScreen extends BaseScreen{

    public MasterScreen(AndroidDriver driver) {
        super(driver);
    }
    public boolean hasTransferBtn(){
        return getWebElements(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]")).size()>0;
    }

}
