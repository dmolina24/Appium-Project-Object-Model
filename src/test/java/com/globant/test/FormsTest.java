package com.globant.test;

import com.globant.utils.test.BaseTest;
import org.testng.annotations.Test;

public class FormsTest extends BaseTest {

    @Test
    public void checkContentForms(){
        swipeScreen = formScreen.tapOnSwipeBtn();

        softAssert.assertAll();
    }
}
