package com.globant.screen.auth;

import com.github.javafaker.Faker;
import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;


public class SignUpScreen extends AuthScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.EditText\").text(\"Confirm password\")")
    private WebElement confirmPassword;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"SIGN UP\")")
    private WebElement signUpBtn;

    public void setConfirmPassword(String password){
        isElementClickable(confirmPassword);
        confirmPassword.click();
        confirmPassword.sendKeys(password);
    }

    public SignUpPopup tapOnSignUpBtn(){
        isElementClickable(signUpBtn);
        signUpBtn.click();
        return new SignUpPopup(driver);
    }



    public SignUpScreen(AndroidDriver driver) {
        super(driver);
    }
}
