package com.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.example.managers.ObjectManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Base {

    private String url = "http://www.mtsac.edu/";

    @DataProvider(name = "data1")
    public Object[][] accessData(){
        return new Object[][]{
                new Object[]{new ObjectManager()}
        };
    }

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver");
        WebDriverRunner.setWebDriver(new FirefoxDriver());
        Selenide.open(url);
    }

    @AfterMethod
    public void tearDown(){
        Selenide.close();
    }
}
