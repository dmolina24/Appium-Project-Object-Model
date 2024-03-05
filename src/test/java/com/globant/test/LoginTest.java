package com.globant.test;

import com.github.javafaker.Faker;
import com.globant.screen.HomeScreen;
import com.globant.screen.auth.SignUpScreen;
import com.globant.utils.test.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void checkSignUp(){
        homeScreen = new HomeScreen(driver);
        loginScreen = homeScreen.tapOnLoginBtn();
        checkNavBar(loginScreen);
        SignUpScreen signUpScreen = loginScreen.tapOnsignUpTab();


    }

    private String generateRandomEmail(){
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }
}
