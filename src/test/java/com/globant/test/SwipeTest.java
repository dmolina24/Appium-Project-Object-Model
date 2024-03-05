package com.globant.test;

import com.globant.screen.HomeScreen;
import com.globant.utils.test.BaseTest;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest {

    @Test
    public void SwipeCards(){
        homeScreen = new HomeScreen(driver);
        swipeScreen = homeScreen.tapOnSwipeBtn();

        checkNavBar(swipeScreen);

        swipeScreen.leftSwipe();

        softAssert.assertAll();

    }

}
