package com.globant.test;

import com.globant.screen.DragScreen;
import com.globant.screen.FormScreen;
import com.globant.screen.SwipeScreen;
import com.globant.screen.auth.LoginScreen;
import com.globant.utils.test.BaseTest;
import org.testng.annotations.Test;

public class WebViewTest extends BaseTest {
    @Test
    public void checkWebViewNavBar() {
        System.out.println("Test Check Web View Bar");

        LoginScreen loginScreen = webViewScreen.tapOnLoginBtn();
        FormScreen formScreen = loginScreen.tapOnFormsBtn();
        SwipeScreen swipeScreen = formScreen.tapOnSwipeBtn();
        DragScreen dragScreen = swipeScreen.tapOnDragBtn();

        softAssert.assertAll();
    }
}
