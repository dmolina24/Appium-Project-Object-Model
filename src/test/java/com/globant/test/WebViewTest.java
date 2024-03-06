package com.globant.test;

import com.globant.utils.test.BaseTest;
import org.testng.annotations.Test;

public class WebViewTest extends BaseTest {
    @Test
    public void checkWebViewNavBar() {

        checkNavBar(webViewScreen);
        loginScreen = webViewScreen.tapOnLoginBtn();

        softAssert.assertAll();
    }
}
