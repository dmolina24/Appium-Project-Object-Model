package com.globant.test;

import com.github.javafaker.Faker;
import com.globant.screen.home.HomeScreen;
import com.globant.screen.login.SignUpScreen;
import com.globant.screen.login.SuccessPopUpScreen;
import com.globant.utils.test.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Random;

public class LoginTest extends BaseTest {

    @Test
    public void checkContentLoginTest(){
        formScreen = loginScreen.tapOnFormsBtn();


        softAssert.assertAll();
    }

    @Test
    public void checkSignUp(){

        homeScreen = new HomeScreen(driver);
        loginScreen = homeScreen.tapOnLoginBtn();

        checkNavBar(loginScreen);

        SignUpScreen signUpScreen = loginScreen.tapOnsignUpTab();

        String email = generateRandomEmail();
        String password = generateRandomPassword(8);

        signUpScreen.setEmailInput(email);
        signUpScreen.setPasswordInput(password);
        signUpScreen.setConfirmPassword(password);

        SuccessPopUpScreen signUpPopup = signUpScreen.tapOnSignUpBtn();

        softAssert.assertEquals(signUpPopup.getTitlePopUpText(), "Signed Up!");
        softAssert.assertEquals(signUpPopup.getMessagePopUpText(), "You successfully signed up!");
        softAssert.assertEquals(signUpPopup.getPopYpBtnText(), "OK");

        signUpPopup.onTapPopUpBtn();

        softAssert.assertAll();
    }

    @Test()
    @Parameters({"email", "password"})
    public void checkLogin(String email, String password ){
        homeScreen = new HomeScreen(driver);
        loginScreen = homeScreen.tapOnLoginBtn();

        checkNavBar(loginScreen);

        loginScreen.setEmailInput(email);
        loginScreen.setPasswordInput(password);

        SuccessPopUpScreen successPopUpScreen = loginScreen.tapOnLoginBtnRequest();

        softAssert.assertEquals(successPopUpScreen.getTitlePopUpText(), "Success");
        softAssert.assertEquals(successPopUpScreen.getMessagePopUpText(), "You are logged in!");
        softAssert.assertEquals(successPopUpScreen.getPopYpBtnText(), "OK");

        successPopUpScreen.onTapPopUpBtn();

        softAssert.assertAll();
    }

    private String generateRandomEmail(){
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public String generateRandomPassword(int length) {
        String numbers = "0123456789";
        StringBuilder password = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(numbers.length());
            password.append(numbers.charAt(randomIndex));
        }

        return password.toString();
    }


}
