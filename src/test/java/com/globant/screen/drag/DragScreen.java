package com.globant.screen.drag;

import com.globant.screen.NavBarScreen;
import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragScreen extends NavBarScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Drag and Drop\")")
    private WebElement titleSection;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"\uDB80\uDC6A\")")
    private WebElement resetBtn;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drop-l1\")")
    private WebElement squareC11;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drop-c1\")")
    private WebElement squareC12;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drop-r1\")")
    private WebElement squareC13;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drop-l2\")")
    private WebElement squareC21;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drop-c2\")")
    private WebElement squareC22;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drop-r2\")")
    private WebElement squareC23;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drop-l3\")")
    private WebElement squareC31;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drop-c3\")")
    private WebElement squareC32;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"dro")
    private WebElement squareC33;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drag-l2\")")
    private WebElement squareSolution1;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drag-r3\")")
    private WebElement squareSolution2;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drag-r1\")")
    private WebElement squareSolution3;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drag-c1\")")
    private WebElement squareSolution4;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drag-c3\")")
    private WebElement squareSolution5;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drag-r2\")")
    private WebElement squareSolution6;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drag-c2\")")
    private WebElement squareSolution7;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drag-l1\")")
    private WebElement squareSolution8;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.ViewGroup\").description(\"drag-l3\")")
    private WebElement squareSolution9;

    public String getTitleSectionText(){
        isElementDisplayed(titleSection);
        return titleSection.getText();
    }

    public boolean isVisibleResetBtn(){
        isElementDisplayed(resetBtn);
        return resetBtn.isDisplayed();
    }

    public boolean isVisibleSquare11(){
        isElementDisplayed(squareC11);
        return squareC11.isDisplayed();
    }

    public boolean isVisibleSquare12(){
        isElementDisplayed(squareC12);
        return squareC12.isDisplayed();
    }

    public boolean isVisibleSquare13(){
        isElementDisplayed(squareC13);
        return squareC13.isDisplayed();
    }

    public boolean isVisibleSquare21(){
        isElementDisplayed(squareC21);
        return squareC21.isDisplayed();
    }

    public boolean isVisibleSquare22(){
        isElementDisplayed(squareC22);
        return squareC22.isDisplayed();
    }

    public boolean isVisibleSquare23(){
        isElementDisplayed(squareC23);
        return squareC23.isDisplayed();
    }

    public boolean isVisibleSquare31(){
        isElementDisplayed(squareC31);
        return squareC31.isDisplayed();
    }

    public boolean isVisibleSquare32(){
        isElementDisplayed(squareC32);
        return squareC32.isDisplayed();
    }

    public boolean isVisibleSquare33(){
        isElementDisplayed(squareC33);
        return squareC33.isDisplayed();
    }

    public DragScreen(AndroidDriver driver) {
        super(driver);
    }
}
