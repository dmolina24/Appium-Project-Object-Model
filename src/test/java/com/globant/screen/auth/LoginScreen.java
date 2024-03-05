package com.globant.screen.auth;

import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginScreen extends AuthScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"When the device has Touch/FaceID (iOS) or FingerPrint enabled a biometrics button will be shown to use and test the login.\")")
    private WebElement adviceLoginLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"LOGIN\")")
    private WebElement loginBtn;


    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }
}
