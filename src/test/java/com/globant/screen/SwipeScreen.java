package com.globant.screen;

import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.time.Duration.ofSeconds;

public class SwipeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Swipe horizontal\")")
    private WebElement titleSection;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Or swipe vertical to find what I'm hiding.\")")
    private WebElement instructionsMessage;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"card\")")
    private List<WebElement> cards;

    @SuppressWarnings("rawtypes")
    public void scroll(int startx, int starty, int endx, int endy) {

        TouchAction touchAction = new TouchAction(driver);

        touchAction.longPress(PointOption.point(startx, starty))
                .waitAction(WaitOptions.waitOptions(ofSeconds(1)))
                .moveTo(PointOption.point(endx, endy))
                .release()
                .perform();
    }

    public void rightSwipe(){
        Dimension size = driver.manage().window().getSize();

        int startX = (int) (size.width * 0.8);
        int endX =  (int) (size.width * 0.2);
        int startY = (int) (size.height * 0.7);

        scroll(startX, startY, endX, startY);
    }

    public void leftSwipe(){
        Dimension size = driver.manage().window().getSize();

        int startX = (int) (size.getWidth() * 0.2);
        int endX =  (int) (size.getWidth() * 0.8);
        int startY = (int) (size.getHeight() * 0.7);

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, startY)).release().perform();
    }

    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }
}
