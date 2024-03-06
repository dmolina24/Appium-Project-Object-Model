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
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;

public class BaseScreen {

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

    public String getTextElement(WebElement element){
        isElementDisplayed(element);
        return element.getText();
    }

    private void swipe(int startX, int startY, int endX, int endY, int durationOnMilli){
        Point start = new Point(startX, startY);
        Point end = new Point(endX, endY);
        Duration duration = Duration.ofMillis(durationOnMilli);

        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence swipe = new Sequence(input,0);
        swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.x, start.y));
        swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), end.x, end.y));
        swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Arrays.asList(swipe));
    }

    public void swipeDown(){
        Dimension size = driver.manage().window().getSize();

        int startX = (int) (size.getWidth() * 0.5);
        int startY = (int) (size.getHeight() * 0.4);
        int endY = 0;

        swipe(startX, startY, startX, endY, 200 );
    }

    public void swipeRight(){

        Dimension size = driver.manage().window().getSize();

        int startX = (int) (size.getWidth() * 0.8);
        int endX =  (int) (size.getWidth() * 0.2);
        int startY = (int) (size.getHeight() * 0.7);

        swipe(startX, startY, endX, startY, 1000);

    }

    public void swipeLeft(){

        Dimension size = driver.manage().window().getSize();

        int startX = (int) (size.getWidth() * 0.2);
        int endX =  (int) (size.getWidth() * 0.8);
        int startY = (int) (size.getHeight() * 0.7);

        swipe(startX, startY, endX, startY, 1000);
    }

    public BaseScreen(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
