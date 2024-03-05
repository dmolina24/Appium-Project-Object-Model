package com.globant.utils.test;

import com.globant.screen.*;
import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseTest {

    private static final String PROPERTIES_FILE = "src/test/resources/config.properties";
    private static final Properties properties = new Properties();
    public static AndroidDriver driver;
    public static SoftAssert softAssert;

    protected static HomeScreen homeScreen;
    protected static WebViewScreen webViewScreen;
    protected static LoginScreen loginScreen;
    protected static FormScreen formScreen;
    protected static SwipeScreen swipeScreen;
    protected static DragScreen dragScreen;

    @BeforeMethod
    public void initAssert(){
        softAssert = new SoftAssert();
    }
    @AfterMethod
    public void afterMethod() {
        softAssert = null;
    }

    @BeforeTest
    public void environmentSetup(){
        loadProperties();
        UiAutomator2Options capabilities = new UiAutomator2Options();
        setUpCapabilities(capabilities);
        try{
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
        }catch(MalformedURLException exception){
            System.out.println(exception.getMessage());
        }
    }

    @AfterTest
    void tearDown() {
        driver.quit();
    }

    public void loadProperties(){
        try{
            FileInputStream fileInputStream = new FileInputStream(PROPERTIES_FILE);
            properties.load(fileInputStream);
        }catch(IOException e){
            throw new RuntimeException("Error reading the properties file: " + PROPERTIES_FILE);
        }
    }

    public static void setUpCapabilities(UiAutomator2Options capabilities){
        capabilities.setPlatformName(getCapability("platformName"));
        capabilities.setDeviceName(getCapability("deviceName"));
        capabilities.setAppPackage(getCapability("appPackage"));
        capabilities.setAppActivity(getCapability("appActivity"));
    }

    public static String getCapability(String variable){
        return properties.getProperty(variable);
    }

    public static void checkNavBar(BaseScreen screen){


    }

    public HomeScreen getHomeScreen(){
        return new HomeScreen(driver);
    }
}
