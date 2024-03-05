package com.globant.utils.screens;

import com.globant.screen.drag.DragScreen;
import com.globant.screen.form.FormScreen;
import com.globant.screen.home.HomeScreen;
import com.globant.screen.login.LoginScreen;
import com.globant.screen.swipe.SwipeScreen;
import com.globant.screen.web.WebViewScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseScreen {

    protected AndroidDriver driver;

    public boolean isElementDisplayed(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
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

    public BaseScreen(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
