package com.finjet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen extends BaseScreen{
    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }
    public void tapForgotUserIdBtn(){
        getWebElement(By.xpath("android.widget.TextView[@text=\"Forgot User ID\"]")).click();
    }
    public void tapForgotPasswordBtn(){
        getWebElement(By.xpath("android.widget.TextView[@text=\"Forgot Password\"]")).click();
    }
    public WelcomeScreen tapSinUpLink(){
        getWebElement(By.xpath("//android.widget.TextView[@text=\"Sign Up\"]")).click();
        return getInstance(WelcomeScreen.class);
    }
}
