package com.globant.test;

import com.github.javafaker.Faker;
import com.globant.screen.HomeScreen;
import com.globant.screen.LoginScreen;
import com.globant.utils.test.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void checkLoginNavBar(){
        homeScreen = new HomeScreen(driver);
        loginScreen = homeScreen.tapOnLoginBtn();
        checkNavBar(loginScreen);
        System.out.println(generateRandomEmail());
    }


    private String generateRandomEmail(){
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }
}
