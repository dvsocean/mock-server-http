package com.example.testRunner;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.example.managers.InstanceManager;
import com.example.selectors.DesktopRunner;
import com.example.users.User;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class ActionsForFrontPage {

    private String url = "http://www.mtsac.edu/";

    private User user = new User();

    @DataProvider(name = "source1")
    public Object[][] dataSourceOne() {
        return new Object[][] {
                new Object[] { new InstanceManager(new DesktopRunner()) }
        };
    }

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver");
        WebDriverRunner.setWebDriver(new FirefoxDriver());
        Selenide.open(url);
    }

   @Test(dataProvider = "source1")
    public void checkScheduleForFall(InstanceManager instanceManager){
        instanceManager.onTheFrontPage().loginToSchoolPortalFor(user);
    }

    @Test(dataProvider = "source1")
    public void findDetailsForObtainingDegree(InstanceManager instanceManager){
        instanceManager.onTheFrontPage().find(user);
    }

    @AfterMethod
    public void tearDown(){
        Selenide.close();
    }
}
