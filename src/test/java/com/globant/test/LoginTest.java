package com.globant.test;

import com.github.javafaker.Faker;
import com.globant.screen.HomeScreen;
import com.globant.screen.auth.SignUpPopup;
import com.globant.screen.auth.SignUpScreen;
import com.globant.utils.test.BaseTest;
import org.testng.annotations.Test;

import java.util.Random;

public class LoginTest extends BaseTest {

    private String email;
    private String password;

    @Test
    public void checkSignUp(){
        homeScreen = new HomeScreen(driver);
        loginScreen = homeScreen.tapOnLoginBtn();
        checkNavBar(loginScreen);
        SignUpScreen signUpScreen = loginScreen.tapOnsignUpTab();

        email = generateRandomEmail();
        password = generateRandomPassword(8);

        signUpScreen.setEmailInput(email);
        signUpScreen.setPasswordInput(password);
        signUpScreen.setConfirmPassword(password);

        SignUpPopup signUpPopup = signUpScreen.tapOnSignUpBtn();
        signUpPopup.onTapOkBtn();

    }

    @Test(dependsOnMethods = {"checkSignUp"})
    public void checkLogin(){
        
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
