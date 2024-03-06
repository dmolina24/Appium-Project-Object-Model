package com.globant.screen.login;

import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SuccessPopUpScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").resourceId(\"android:id/alertTitle\")")
    private WebElement titlePopUp;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").resourceId(\"android:id/message\")")
    private WebElement messagePopUp;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.Button\").resourceId(\"android:id/button1\")")
    private WebElement popUpBtn;

    public String getTitlePopUpText(){
        return getTextElement(titlePopUp);
    }

    public String getMessagePopUpText(){
        return getTextElement(messagePopUp);
    }

    public String getPopYpBtnText(){
        return getTextElement(popUpBtn);
    }

    public void onTapPopUpBtn(){
        isElementClickable(popUpBtn);
        popUpBtn.click();
    }
    public SuccessPopUpScreen(AndroidDriver driver) {
        super(driver);
    }
}
