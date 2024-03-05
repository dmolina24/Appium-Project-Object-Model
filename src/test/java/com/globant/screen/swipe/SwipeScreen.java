package com.globant.screen.swipe;

import com.globant.screen.NavBarScreen;
import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class SwipeScreen extends NavBarScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Swipe horizontal\")")
    private WebElement titleSection;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Or swipe vertical to find what I'm hiding.\")")
    private WebElement instructionsMessage;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"card\")")
    private List<WebElement> cards;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.ImageView\").description(\"WebdriverIO logo\")")
    private WebElement hiddenLogo;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"You found me!!!\");")
    private WebElement hiddenMessage;

    public String getTitleText(){
        isElementDisplayed(titleSection);
        return titleSection.getText();
    }

    public boolean isVisibleHiddenLogo(){
        isElementDisplayed(hiddenLogo);
        return hiddenLogo.isDisplayed();
    }

    public boolean isVisibleHiddenMessage(){
        isElementDisplayed(hiddenMessage);
        return hiddenMessage.isDisplayed();
    }

    public String getInstructionText(){
        isElementDisplayed(instructionsMessage);
        return instructionsMessage.getText();
    }

    public int getNumberOfCard(){
        return cards.size();
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

    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }
}
