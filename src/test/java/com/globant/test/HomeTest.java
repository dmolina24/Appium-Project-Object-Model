package com.globant.test;

import com.globant.screen.*;
import com.globant.screen.auth.LoginScreen;
import com.globant.utils.test.BaseTest;
import org.testng.annotations.*;

public class HomeTest extends BaseTest {

    @Test(priority = 1)
    public void checkHomeNavBar() {
        homeScreen = getHomeScreen();
        checkNavBar(homeScreen);
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void checkHomeContent(){

        softAssert.assertTrue(homeScreen.isRobotLogoIsDisplayed());
        softAssert.assertFalse(homeScreen.isRobotLogoIsClickable());

        softAssert.assertTrue(homeScreen.isTitleWebDriverIsDisplayed());
        softAssert.assertFalse(homeScreen.isTitleWebDriverIsClickable());

        softAssert.assertTrue(homeScreen.isIOLabelIsDisplayed());
        softAssert.assertFalse(homeScreen.isIOLabelIsClickable());

        softAssert.assertTrue(homeScreen.isDescriptionLabelIsDisplayed());
        softAssert.assertFalse(homeScreen.isDescriptionIsClickable());

        softAssert.assertTrue(homeScreen.isAppleLogoIsDisplayed());
        softAssert.assertFalse(homeScreen.isAppleLogoIsClickable());

        softAssert.assertTrue(homeScreen.isAndroidLogoIsDisplayed());
        softAssert.assertFalse(homeScreen.isAndroidLogoIsClickable());

        softAssert.assertTrue(homeScreen.isSupportLabelIsDisplayed());
        softAssert.assertFalse(homeScreen.isSupportLabelIsClickable());

        webViewScreen = homeScreen.tapOnWebViewBtn();

        LoginScreen loginScreen = webViewScreen.tapOnLoginBtn();

        FormScreen formScreen = loginScreen.tapOnFormsBtn();

        SwipeScreen swipeScreen = formScreen.tapOnSwipeBtn();

        DragScreen dragScreen = swipeScreen.tapOnDragBtn();

        softAssert.assertAll();
    }

}
