package com.finjet.testCases;

import com.finjet.screens.BaseScreen;
import com.finjet.screens.Screen;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    AndroidDriver driver;
    Screen screen;
    @BeforeClass
    public void launchApp(){
        DesiredCapabilities capabilities  = new DesiredCapabilities();
        capabilities.setCapability("udid", "ce041714a3474a2005");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("appPackage", "com.fintech.fintech");
        capabilities.setCapability("appActivity", "com.fintech.fintech.login.LoginActivity");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub"),capabilities);
            screen = new BaseScreen(driver);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }

    @AfterClass
    public void tearDown(){
        driver.quit();

    }
    public AndroidDriver getWebDriver() {
        return driver;
    }


}
