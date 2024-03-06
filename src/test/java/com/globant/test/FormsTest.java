package com.globant.test;

import com.globant.utils.test.BaseTest;
import org.testng.annotations.Test;

public class FormsTest extends BaseTest {

    @Test
    public void checkContentForms(){

        softAssert.assertEquals(formScreen.getTitleText(), "Form components");
        softAssert.assertEquals(formScreen.getTextInputLabel(), "Input field");
        softAssert.assertEquals(formScreen.getTextInputField(), "Type something");
        softAssert.assertEquals(formScreen.getTextTypedLabel(), "You have typed");

        formScreen.setTextInputField("Había una vez una iguana");

        softAssert.assertEquals(formScreen.getTextTypedInputText(), "Había una vez una iguana");
        softAssert.assertEquals(formScreen.getTextSwitchLabel(), "Switch:");
        softAssert.assertTrue(formScreen.switchIsCheckeable());
        softAssert.assertTrue(formScreen.switchIsEnabled());
        

        softAssert.assertEquals(formScreen.getTextDropDownLabel(), "Dropdown:");

        formScreen.tapOnDropDown();

        formScreen.tapOnDropDown();

        swipeScreen = formScreen.tapOnSwipeBtn();
        softAssert.assertAll();
    }
}
