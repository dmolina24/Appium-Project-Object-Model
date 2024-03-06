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
        return getTextElement(titleSection);
    }

    public boolean isVisibleHiddenLogo(){
        isElementDisplayed(hiddenLogo);
        return hiddenLogo.isDisplayed();
    }

    public boolean isVisibleHiddenMessage(){
        isElementDisplayed(hiddenMessage);
        return hiddenMessage.isDisplayed();
    }

    public String getHiddenMessageText(){
        isElementDisplayed(hiddenMessage);
        return hiddenMessage.getText();
    }

    public String getInstructionText(){
        return getTextElement(instructionsMessage);
    }

    public int getNumberOfCard(){
        return cards.size();
    }



    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }
}
