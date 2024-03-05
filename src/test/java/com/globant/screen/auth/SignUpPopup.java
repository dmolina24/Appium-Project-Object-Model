package com.globant.screen.auth;

import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SignUpPopup extends BaseScreen {
    public SignUpPopup(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Signed Up!\")")
    private WebElement titleSignUp;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"You successfully signed up!\")")
    private WebElement messageSignUp;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.Button\").text(\"OK\")")
    private WebElement okBtn;

    public void onTapOkBtn(){
        isElementClickable(okBtn);
        okBtn.click();
    }
}
