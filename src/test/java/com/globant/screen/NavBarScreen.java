package com.globant.screen;

import com.globant.screen.drag.DragScreen;
import com.globant.screen.form.FormScreen;
import com.globant.screen.home.HomeScreen;
import com.globant.screen.login.LoginScreen;
import com.globant.screen.swipe.SwipeScreen;
import com.globant.screen.web.WebViewScreen;
import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class NavBarScreen extends BaseScreen {

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

    public NavBarScreen(AndroidDriver driver) {
        super(driver);
    }
}
