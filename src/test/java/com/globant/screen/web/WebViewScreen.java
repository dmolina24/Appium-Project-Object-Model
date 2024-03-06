package com.globant.screen.web;

import com.globant.screen.NavBarScreen;
import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;

public class WebViewScreen extends NavBarScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Next-gen browser and mobile automation test framework for Node.js\")")
    private WebElement headerMessage;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.View\").text(\"WebdriverIO\")")
    private WebElement logoWebPage;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.Image\").text(\"WebdriverIO\")")
    private WebElement IOLogo;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.Button\").text(\"Search\")")
    private WebElement magnifyingGlass;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.Button\").text(\"Toggle navigation bar\")")
    private WebElement burgerMenu;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.Button\").text(\"Close navigation bar\")")
    private WebElement closeBurgerMenu;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.Button\").text(\"Switch between dark and light mode (currently light mode)\")")
    private WebElement lightModeBtn;

    public boolean isDisplayedHeaderMessage(){
        return isElementDisplayed(headerMessage);
    }

    public boolean isDisplayedLogoWebPage(){
        return isElementDisplayed(logoWebPage);
    }

    public boolean isDisplayedIOLogo(){
        return isElementDisplayed(IOLogo);
    }

    public boolean isDisplayedMagnifyingGlass(){
        return isElementDisplayed(magnifyingGlass);
    }

    public void tapOnBurgerMenu(){
        isElementClickable(burgerMenu);
        burgerMenu.click();
    }

    public void tapOnCloseBurgerMenu(){
        isElementClickable(closeBurgerMenu);
        closeBurgerMenu.click();
    }

    public void tapOnLightModeBtn(){
        isElementClickable(lightModeBtn);
        lightModeBtn.click();
    }

    public WebViewScreen(AndroidDriver driver) {
        super(driver);
    }
}
