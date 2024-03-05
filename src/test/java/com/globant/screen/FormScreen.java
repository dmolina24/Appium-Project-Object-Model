package com.globant.screen;

import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FormScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Form components\")")
    private WebElement formTitle;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Input field:\")")
    private WebElement inputFieldLabel;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.EditText\").text(\"Type something\")")
    private WebElement typedInput;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"You have typed:\")")
    private WebElement typedLabel;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").description(\"input-text-result\"")
    private WebElement typedInputText;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Switch:\")")
    private WebElement switchLabel;




    public FormScreen(AndroidDriver driver) {
        super(driver);
    }
}
