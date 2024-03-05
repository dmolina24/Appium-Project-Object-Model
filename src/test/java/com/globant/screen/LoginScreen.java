package com.globant.screen;

import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Login / Sign up Form\")")
    private WebElement loginSignUpTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Login\")" )
    private WebElement loginTab;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Sign up\")")
    private WebElement signUpTab;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"\uDB80\uDDF0\")")
    private WebElement emailIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").text(\"Email\")")
    private WebElement emailInput;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"\uDB80\uDF41\")")
    private List<WebElement> passwordIcons;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").text(\"Password\")")
    private WebElement passwordInput;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.EditText\").text(\"Confirm password\")")
    private WebElement confirmPassword;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"When the device has Touch/FaceID (iOS) or FingerPrint enabled a biometrics button will be shown to use and test the login.\")")
    private WebElement adviceLoginLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"LOGIN\")")
    private WebElement loginBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\\\"android.widget.TextView\\\").text(\\\"SIGN UP\\\")\"")
    private WebElement signUpBtn;

    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }
}
