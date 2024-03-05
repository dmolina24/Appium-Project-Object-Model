package com.globant.test;

import com.globant.screen.DragScreen;
import com.globant.screen.form.FormScreen;
import com.globant.screen.SwipeScreen;
import com.globant.screen.login.LoginScreen;
import com.globant.utils.test.BaseTest;
import org.testng.annotations.Test;

public class WebViewTest extends BaseTest {
    @Test
    public void checkWebViewNavBar() {
        System.out.println("Test Check Web View Bar");

        loginScreen = webViewScreen.tapOnLoginBtn();

        softAssert.assertAll();
    }
}
