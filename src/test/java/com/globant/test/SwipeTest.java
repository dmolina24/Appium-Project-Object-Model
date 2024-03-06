package com.globant.test;

import com.globant.utils.test.BaseTest;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest {

    @Test
    public void checkContentSwipe(){

        softAssert.assertEquals(swipeScreen.getTitleText(), "Swipe horizontal");
        softAssert.assertEquals(swipeScreen.getInstructionText(), "Or swipe vertical to find what I'm hiding.");

        checkNavBar(swipeScreen);

        dragScreen = swipeScreen.tapOnDragBtn();
        softAssert.assertAll();
    }

    @Test
    public void swipeCards(){
        homeScreen = getHomeScreen();
        swipeScreen = homeScreen.tapOnSwipeBtn();

        swipeScreen.swipeRight();
        swipeScreen.swipeRight();
        swipeScreen.swipeRight();
        swipeScreen.swipeRight();
        swipeScreen.swipeRight();

        softAssert.assertEquals(swipeScreen.getNumberOfCard(), 1);

        swipeScreen.swipeLeft();
        swipeScreen.swipeLeft();
        swipeScreen.swipeLeft();
        swipeScreen.swipeLeft();

        swipeScreen.swipeDown();

        softAssert.assertTrue(swipeScreen.isVisibleHiddenLogo());
        softAssert.assertTrue(swipeScreen.isVisibleHiddenMessage());
        softAssert.assertEquals(swipeScreen.getHiddenMessageText(), "You found me!!!");

        softAssert.assertAll();

    }

}
