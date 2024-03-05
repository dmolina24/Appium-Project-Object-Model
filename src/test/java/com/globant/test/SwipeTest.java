package com.globant.test;

import com.globant.utils.test.BaseTest;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest {

    @Test
    public void checkContentSwipe(){

        softAssert.assertEquals(swipeScreen.getTitleText(), "Swipe horizontal");
        softAssert.assertEquals(swipeScreen.getInstructionText(), "Or swipe vertical to find what I'm hiding.");

        dragScreen = swipeScreen.tapOnDragBtn();
        softAssert.assertAll();
    }

    @Test
    public void swipeCards(){
        homeScreen = getHomeScreen();
        swipeScreen = homeScreen.tapOnSwipeBtn();

        checkNavBar(swipeScreen);

        swipeScreen.swipeRight();
        swipeScreen.swipeRight();
        swipeScreen.swipeRight();
        swipeScreen.swipeRight();

        swipeScreen.swipeLeft();
        swipeScreen.swipeLeft();
        swipeScreen.swipeLeft();
        swipeScreen.swipeLeft();

        swipeScreen.swipeDown();

        softAssert.assertTrue(swipeScreen.isVisibleHiddenLogo());
        softAssert.assertTrue(swipeScreen.isVisibleHiddenMessage());

        softAssert.assertAll();

    }

}
