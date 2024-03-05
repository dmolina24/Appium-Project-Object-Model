package com.globant.screen.auth;

import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SignUpScreen extends AuthScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.EditText\").text(\"Confirm password\")")
    private WebElement confirmPassword;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\\\"android.widget.TextView\\\").text(\\\"SIGN UP\\\")\"")
    private WebElement signUpBtn;



    public SignUpScreen(AndroidDriver driver) {
        super(driver);
    }
}
