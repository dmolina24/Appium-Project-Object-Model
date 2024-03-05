package com.globant.utils.screens;

import com.globant.screen.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseScreen {

    protected AndroidDriver driver;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").description(\"Home\")")
    protected WebElement homeBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").description(\"Webview\")" )
    protected WebElement webViewBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").description(\"Login\")" )
    protected WebElement loginBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").description(\"Forms\")" )
    protected WebElement formsBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").description(\"Swipe\")" )
    protected WebElement swipeBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").description(\"Drag\")" )
    protected WebElement dragBtn;

    /*public void tapOnWebViewBtn(){
        try {
            Thread.sleep(3*1000);
        }catch (Exception e){

        }
        webViewBtn.click();
    }*/

    public HomeScreen tapOnHomeBtn(){
        isElementDisplayed(homeBtn);
        homeBtn.click();
        return new HomeScreen(driver);
    }

    public WebViewScreen tapOnWebViewBtn(){
        isElementDisplayed(webViewBtn);
        webViewBtn.click();
        return new WebViewScreen(driver);
    }

    public LoginScreen tapOnLoginBtn(){
        isElementDisplayed(loginBtn);
        loginBtn.click();
        return new LoginScreen(driver);
    }

    public FormScreen tapOnFormsBtn(){
        isElementDisplayed(formsBtn);
        formsBtn.click();
        return new FormScreen(driver);
    }

    public SwipeScreen tapOnSwipeBtn(){
        isElementDisplayed(swipeBtn);
        swipeBtn.click();
        return new SwipeScreen(driver);
    }

    public DragScreen tapOnDragBtn(){
        isElementDisplayed(dragBtn);
        dragBtn.click();
        return new DragScreen(driver);
    }

    public boolean isElementDisplayed(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isElementClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        try{
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return Boolean.parseBoolean(element.getAttribute("clickable"));
        }catch(Exception e){
            return false;
        }
    }

    public boolean homeBtnIsDisplayed(){
        return isElementDisplayed(homeBtn);
    }

    public boolean homeBtnIsClickable(){
        return isElementClickable(homeBtn);
    }

    public boolean webViewBtnIsDisplayed(){
        return isElementDisplayed(webViewBtn);
    }

    public boolean webViewBtnIsClickable(){
        return isElementClickable(webViewBtn);
    }

    public boolean loginBtnIsDisplayed(){
        return isElementDisplayed(loginBtn);
    }

    public boolean loginBtnIsClickable(){
        return isElementClickable(loginBtn);
    }

    public boolean formsBtnIsDisplayed(){
        return isElementClickable(formsBtn);
    }

    public boolean formsBtnIsClickable(){
        return isElementDisplayed(formsBtn);
    }

    public boolean swipeBtnIsDisplayed(){
        return isElementDisplayed(swipeBtn);
    }

    public boolean swipeBtnClickable(){
        return isElementClickable(swipeBtn);
    }

    public boolean dragBtnIsDisplayed(){
        return isElementDisplayed(dragBtn);
    }

    public boolean dragBtnIsClickable(){
        return isElementClickable(dragBtn);
    }


    public BaseScreen(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
