package com.example.selectors;

import com.codeborne.selenide.WebDriverRunner;
import com.example.interfaces.ActionObject;
import com.example.users.Danika;
import com.example.users.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DesktopHomePageSelectors implements ActionObject {

    private User user;

    public DesktopHomePageSelectors(User user){
        this.user = user;
    }

    @Override
    public ActionObject loginAs(User user) {
        $(byText("Portal Login")).click();
        $("#username").setValue(user.getUsername());
        $("#password").setValue(user.getPassword()).pressEnter();
        return this;
    }
}
