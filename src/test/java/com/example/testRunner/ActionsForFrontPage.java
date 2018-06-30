package com.example.testRunner;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.example.interfaces.SelectorObjects;
import com.example.managers.Manager;
import com.example.selectors.DesktopSelectors;
import com.example.users.Danika;
import com.example.users.User;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class ActionsForFrontPage {

    private String url = "http://www.mtsac.edu/";

    private User user = new User();

    @DataProvider(name = "source1")
    public Object[][] dataSourceOne() {
        return new Object[][] {
                new Object[] { new Manager( new DesktopSelectors() ) }
        };
    }

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver");
        WebDriverRunner.setWebDriver(new FirefoxDriver());
        Selenide.open(url);
    }

   @Test(dataProvider = "source1")
    public void checkScheduleForFall(Manager manager) throws InterruptedException, IOException {
        manager.onTheHomePage().loginToSchoolPortalFor(user);
    }

    @AfterClass
    public void tearDown(){
        Selenide.close();
    }
}
