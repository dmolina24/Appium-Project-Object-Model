package com.globant.screen.login;

import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AuthScreen extends BaseScreen {

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

    public SignUpScreen tapOnsignUpTab(){
        isElementClickable(signUpTab);
        signUpTab.click();
        return new SignUpScreen(driver);
    }

    public void setEmailInput(String email){
        isElementClickable(emailInput);
        emailInput.click();
        emailInput.sendKeys(email);
    }

    public void setPasswordInput(String password){
        isElementClickable(passwordInput);
        passwordInput.click();
        passwordInput.sendKeys(password);
    }

    public AuthScreen(AndroidDriver driver) {
        super(driver);
    }
}
