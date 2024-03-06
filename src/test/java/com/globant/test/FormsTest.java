package com.globant.test;

import com.globant.screen.form.BtnPopUp;
import com.globant.utils.test.BaseTest;
import org.testng.annotations.Test;

public class FormsTest extends BaseTest {

    @Test
    public void checkContentForms(){

        checkNavBar(formScreen);

        softAssert.assertEquals(formScreen.getTitleText(), "Form components");
        softAssert.assertEquals(formScreen.getTextInputLabel(), "Input field:");
        softAssert.assertEquals(formScreen.getTextInputField(), "Type something");
        softAssert.assertEquals(formScreen.getTextTypedLabel(), "You have typed:");

        formScreen.setTextInputField("Había una vez una iguana");

        softAssert.assertEquals(formScreen.getTextTypedInputText(), "Había una vez una iguana");
        softAssert.assertEquals(formScreen.getTextSwitchLabel(), "Switch:");
        softAssert.assertTrue(formScreen.switchIsCheckeable());
        softAssert.assertTrue(formScreen.switchIsEnabled());

        driver.hideKeyboard();

        softAssert.assertFalse(formScreen.switchIsChecked());
        softAssert.assertEquals(formScreen.getTextStateSwitchLabel(), "Click to turn the switch ON");

        formScreen.tapOnSwitchBtn();

        softAssert.assertTrue(formScreen.switchIsChecked());
        softAssert.assertEquals(formScreen.getTextStateSwitchLabel(), "Click to turn the switch OFF");

        softAssert.assertEquals(formScreen.getTextDropDownLabel(), "Dropdown:");
        softAssert.assertEquals(formScreen.getDropDowntext(), "Select an item...");

        formScreen.tapOnDropDown();

        softAssert.assertEquals(formScreen.getTextDefaultOptionDropDown(), "Select an item...");
        softAssert.assertEquals(formScreen.getTextFirstOptionDropDown(), "webdriver.io is awesome");
        softAssert.assertEquals(formScreen.getTextSecondOptionDropDown(), "Appium is awesome");
        softAssert.assertEquals(formScreen.getTextThirdOptionDropDown(), "This app is awesome");

        formScreen.tapOnDefaultOptionDropDown();

        softAssert.assertEquals(formScreen.getTextButtonLabel(), "Buttons");
        softAssert.assertEquals(formScreen.getActiveBtnText(), "Active");
        softAssert.assertEquals(formScreen.getInactiveBtnText(), "Inactive");
        softAssert.assertFalse(formScreen.isClickableInactiveBtn());

        BtnPopUp btnPopUp = formScreen.tapOnActiveBtn();

        softAssert.assertEquals(btnPopUp.getTextTitlePopUp(), "This button is");
        softAssert.assertEquals(btnPopUp.getTextMessagePopUp(), "This button is active");
        softAssert.assertEquals(btnPopUp.getTextOkBtn(), "OK");
        softAssert.assertEquals(btnPopUp.getTextCancelBtn(), "CANCEL");
        softAssert.assertEquals(btnPopUp.getTextAskLaterBtn(), "ASK ME LATER");

        softAssert.assertTrue(btnPopUp.isClickableOkBtn());
        softAssert.assertTrue(btnPopUp.isClickableCancelBtn());
        softAssert.assertTrue(btnPopUp.isClickableAskLaterBtn());

        btnPopUp.tapOnOkBtn();
        btnPopUp = null;

        btnPopUp = formScreen.tapOnActiveBtn();
        btnPopUp.tapOnCancelBtn();
        btnPopUp = null;

        btnPopUp = formScreen.tapOnActiveBtn();
        btnPopUp.tapOnAskLaterBtn();
        btnPopUp = null;
        
        swipeScreen = formScreen.tapOnSwipeBtn();
        softAssert.assertAll();
    }
}
