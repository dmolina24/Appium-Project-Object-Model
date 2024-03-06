package com.globant.test;

import com.globant.utils.test.BaseTest;
import org.testng.annotations.Test;

public class WebViewTest extends BaseTest {
    @Test
    public void checkWebContent() {

        checkNavBar(webViewScreen);

        softAssert.assertTrue(webViewScreen.isDisplayedLogoWebPage());
        softAssert.assertTrue(webViewScreen.isDisplayedHeaderMessage());
        softAssert.assertTrue(webViewScreen.isDisplayedIOLogo());
        softAssert.assertTrue(webViewScreen.isDisplayedMagnifyingGlass());

        webViewScreen.tapOnBurgerMenu();
        webViewScreen.tapOnLightModeBtn();
        webViewScreen.tapOnCloseBurgerMenu();

        loginScreen = webViewScreen.tapOnLoginBtn();

        softAssert.assertAll();
    }
}
