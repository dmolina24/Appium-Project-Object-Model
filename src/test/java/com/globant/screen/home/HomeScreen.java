package com.globant.screen.home;

import com.globant.screen.NavBarScreen;
import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreen extends NavBarScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").index(0)")
    private WebElement robotLogo;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"WEBDRIVER\")")
    private WebElement titleWebDriver;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").index(2)")
    private WebElement IOLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Demo app for the appium-boilerplate\")")
    private WebElement descriptionLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").index(4)")
    private WebElement appleLogo;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").index(5)")
    private WebElement androidLogo;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Support\")")
    private WebElement supportLogo;

    public boolean isRobotLogoIsDisplayed(){
        return isElementDisplayed(robotLogo);
    }

    public boolean isRobotLogoIsClickable(){
        return isElementClickable(robotLogo);
    }

    public boolean isTitleWebDriverIsDisplayed(){
        return isElementDisplayed(titleWebDriver);
    }

    public boolean isTitleWebDriverIsClickable(){
        return isElementClickable(titleWebDriver);
    }

    public boolean isIOLabelIsDisplayed(){
        return isElementDisplayed(IOLabel);
    }

    public boolean isIOLabelIsClickable(){
        return isElementClickable(IOLabel);
    }

    public boolean isDescriptionLabelIsDisplayed(){
        return isElementDisplayed(descriptionLabel);
    }

    public boolean isDescriptionIsClickable(){
        return isElementClickable(descriptionLabel);
    }

    public boolean isAppleLogoIsDisplayed(){
        return isElementDisplayed(appleLogo);
    }

    public boolean isAppleLogoIsClickable(){
        return isElementClickable(appleLogo);
    }

    public boolean isAndroidLogoIsDisplayed(){
        return isElementDisplayed(androidLogo);
    }

    public boolean isAndroidLogoIsClickable(){
        return isElementClickable(androidLogo);
    }

    public boolean isSupportLabelIsDisplayed(){
        return isElementDisplayed(supportLogo);
    }

    public boolean isSupportLabelIsClickable(){
        return isElementClickable(supportLogo);
    }



    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

}
