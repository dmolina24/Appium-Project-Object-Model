package com.globant.screen.form;

import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class BtnPopUp extends BaseScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").resourceId(\"android:id/alertTitle\")")
    private WebElement titlePopUp;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").resourceId(\"android:id/message\")")
    private WebElement messagePopUp;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.Button\").resourceId(\"android:id/button1\")")
    private WebElement okBtn;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.Button\").resourceId(\"android:id/button2\")")
    private WebElement cancelBtn;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.Button\").resourceId(\"android:id/button3\")")
    private WebElement askLaterBtn;

    public String getTextTitlePopUp(){
        return getTextElement(titlePopUp);
    }

    public String getTextMessagePopUp(){
        return getTextElement(messagePopUp);
    }

    public String getTextOkBtn(){
        return getTextElement(okBtn);
    }

    public boolean isClickableOkBtn(){
        return isElementClickable(okBtn);
    }

    public void tapOnOkBtn(){
        isElementClickable(okBtn);
        okBtn.click();
    }

    public String getTextCancelBtn(){
        return getTextElement(cancelBtn);
    }

    public boolean isClickableCancelBtn(){
        return isElementClickable(cancelBtn);
    }

    public void tapOnCancelBtn(){
        isElementClickable(cancelBtn);
        cancelBtn.click();
    }

    public String getTextAskLaterBtn(){
        return getTextElement(askLaterBtn);
    }

    public boolean isClickableAskLaterBtn(){
        return isElementClickable(askLaterBtn);
    }

    public void tapOnAskLaterBtn(){
        isElementClickable(askLaterBtn);
        askLaterBtn.click();
    }

    public BtnPopUp(AndroidDriver driver) {
        super(driver);
    }
}
