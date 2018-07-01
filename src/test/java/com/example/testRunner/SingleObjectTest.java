package com.example.testRunner;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.example.managers.ObjectManager;
import com.example.users.Danika;
import com.example.users.User;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleObjectTest {

    private String url = "http://www.mtsac.edu/";

    Danika danika = new Danika();

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

    @Test(dataProvider = "data1")
    public void veryifyUserAuthentication(ObjectManager manager){
        manager.onTheHomePage().login(danika);
    }

    @AfterMethod
    public void tearDown(){
        Selenide.close();
    }
}
