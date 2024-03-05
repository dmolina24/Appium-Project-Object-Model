package com.globant.screen.login;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends AuthScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"When the device has Touch/FaceID (iOS) or FingerPrint enabled a biometrics button will be shown to use and test the login.\")")
    private WebElement adviceLoginLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"LOGIN\")")
    private WebElement loginBtn;

    public SuccessPopUpScreen tapOnLoginBtnRequest(){
        isElementClickable(loginBtn);
        loginBtn.click();
        return new SuccessPopUpScreen(driver);
    }

    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }
}
