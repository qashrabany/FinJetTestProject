package com.finjet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SignUpScreen extends BaseScreen{
public SignUpScreen(AndroidDriver driver) {
    super(driver);
}
    public SignUpScreen fillUserId(String userid) {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[1]")).sendKeys(userid);
        return this;
    }
    public SignUpScreen fillAccountNumber(String accountnumber) {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[2]")).sendKeys(accountnumber);
        return this;
    }

    public SignUpScreen fillAccountName(String accountname) {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[3]")).sendKeys(accountname);
        return this;
    }

    public SignUpScreen fillMobileNumber(String mobilenumber) {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[4]")).sendKeys(mobilenumber);
        return this;
    }
    public SignUpScreen fillDateOfBirth(Date dateofbirth) {
        // Define the date format (adjust the pattern as needed)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // Convert the Date to a String
        String formattedDate = sdf.format(dateofbirth);
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.view.View[1]")).sendKeys(formattedDate);
        return this;
    }
    public SignUpScreen fillNidNo(String nidnumber) {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[5]")).sendKeys(nidnumber);
        return this;
    }
    public SignUpScreen clickAgreeBtn() {
        getWebElement(By.xpath("//android.widget.CheckBox")).click();
        return getInstance(SignUpScreen.class);
    }

}
