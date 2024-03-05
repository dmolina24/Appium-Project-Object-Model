package com.globant.test;

import com.globant.screen.*;
import com.globant.utils.test.BaseTest;
import org.testng.annotations.*;

public class HomeTest extends BaseTest {

    @Test
    public void checkHomeNavBar() {
        homeScreen = getHomeScreen();

        softAssert.assertTrue(homeScreen.homeBtnIsDisplayed());
        softAssert.assertTrue(homeScreen.homeBtnIsClickable());

        softAssert.assertTrue(homeScreen.webViewBtnIsDisplayed());
        softAssert.assertTrue(homeScreen.webViewBtnIsClickable());

        softAssert.assertTrue(homeScreen.loginBtnIsDisplayed());
        softAssert.assertTrue(homeScreen.loginBtnIsClickable());
        softAssert.assertTrue(homeScreen.formsBtnIsDisplayed());
        softAssert.assertTrue(homeScreen.formsBtnIsClickable());
        softAssert.assertTrue(homeScreen.swipeBtnIsDisplayed());
        softAssert.assertTrue(homeScreen.swipeBtnClickable());
        softAssert.assertTrue(homeScreen.dragBtnIsDisplayed());
        softAssert.assertTrue(homeScreen.dragBtnIsClickable());

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
