package com.example.testRunner;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.example.managers.Manager;
import com.example.users.Danika;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActionsForFrontPage {

    private String url = "http://www.mtsac.edu/";

    private Danika danika = new Danika();

    @DataProvider
    public Object[][] dataSourceOne() {
        return new Object[][] {
                new Object[] { new Manager() }
        };
    }

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
        WebDriverRunner.setWebDriver(new ChromeDriver());
        Selenide.open(url);
    }

   @Test(dataProvider = "dataSourceOne")
    public void checkScheduleForFall(Manager manager) throws InterruptedException {
        manager.onLogin().asStudent(danika);
    }

    @AfterClass
    public void tearDown(){
        Selenide.close();
    }
}
