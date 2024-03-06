package com.globant.screen.form;

import com.globant.screen.NavBarScreen;
import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FormScreen extends NavBarScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Form components\")")
    private WebElement formTitle;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Input field:\")")
    private WebElement inputFieldLabel;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.EditText\").text(\"Type something\")")
    private WebElement typedInput;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"You have typed:\")")
    private WebElement typedLabel;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").description(\"input-text-result\")")
    private WebElement typedInputText;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Switch:\")")
    private WebElement switchLabel;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.Switch\").description(\"switch\")")
    private WebElement switchBtn;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").description(\"switch-text\")")
    private WebElement stateSwitchLabel;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Dropdown:\")")
    private WebElement dropDownLabel;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.EditText\").resourceId(\"text_input\")")
    private WebElement dropDown;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.CheckedTextView\").resourceId(\"android:id/text1\")")
    private List<WebElement> dropDownOptions;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Buttons\")")
    private WebElement buttonsLabel;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Active\")")
    private WebElement activeBtn;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Inactive\")")
    private WebElement inactiveBtn;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.CheckedTextView\").resourceId(\"android:id/text1\").index(0)")
    private WebElement defaultOptionDropDown;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.CheckedTextView\").resourceId(\"android:id/text1\").index(1)")
    private WebElement firstOptionDropDown;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.CheckedTextView\").resourceId(\"android:id/text1\").index(2)")
    private WebElement secondOptionDropDown;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.CheckedTextView\").resourceId(\"android:id/text1\").index(3)")
    private WebElement thirdOptionDropDown;


    public String getTitleText(){
        return getTextElement(formTitle);
    }

    public String getTextInputLabel(){
        return getTextElement(inputFieldLabel);
    }

    public String getTextInputField(){
        return getTextElement(typedInput);
    }

    public void setTextInputField(String text){
        isElementClickable(typedInput);
        typedInput.click();
        typedInput.sendKeys(text);
    }

    public String getTextTypedLabel(){
        return getTextElement(typedLabel);
    }

    public String getTextTypedInputText(){
        return getTextElement(typedInputText);
    }

    public String getTextSwitchLabel(){
        isElementDisplayed(switchLabel);
        return switchLabel.getText();
    }

    public boolean switchIsCheckeable(){
        isElementClickable(switchBtn);
        return Boolean.parseBoolean(switchBtn.getAttribute("checkable"));
    }

    public boolean switchIsChecked(){
        isElementClickable(switchBtn);
        return Boolean.parseBoolean(switchBtn.getAttribute("checked"));
    }

    public boolean switchIsEnabled(){
        isElementDisplayed(switchBtn);
        return Boolean.parseBoolean(switchBtn.getAttribute("enabled"));
    }

    public void tapOnSwitchBtn(){
        isElementClickable(switchBtn);
        switchBtn.click();
    }

    public String getTextStateSwitchLabel(){return getTextElement(stateSwitchLabel);}

    public String getTextDropDownLabel(){
        return getTextElement(dropDownLabel);
    }

    public void tapOnDropDown(){
        isElementClickable(dropDown);
        dropDown.click();
    }

    public String getDropDowntext(){
        return getTextElement(dropDown);
    }

    public void tapOnDefaultOptionDropDown(){
        isElementClickable(defaultOptionDropDown);
        defaultOptionDropDown.click();
    }

    public String getTextDefaultOptionDropDown(){
        return getTextElement(defaultOptionDropDown);
    }

    public String getTextFirstOptionDropDown(){
        return getTextElement(firstOptionDropDown);
    }

    public String getTextSecondOptionDropDown(){
        return getTextElement(secondOptionDropDown);
    }

    public String getTextThirdOptionDropDown(){
        return getTextElement(thirdOptionDropDown);
    }

    public String getActiveBtnText(){
        return getTextElement(activeBtn);
    }

    public BtnPopUp tapOnActiveBtn(){
        isElementClickable(activeBtn);
        activeBtn.click();
        return new BtnPopUp(driver);
    }

    public boolean isClickableInactiveBtn(){
        return isElementClickable(inactiveBtn);
    }

    public String getInactiveBtnText(){
       return getTextElement(inactiveBtn);
    }

    public String getTextButtonLabel(){
        return getTextElement(buttonsLabel);
    }

    public FormScreen(AndroidDriver driver) {
        super(driver);
    }

}
