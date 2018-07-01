package com.example.selectors;

import com.codeborne.selenide.WebDriverRunner;
import com.example.interfaces.ActionObject;
import com.example.users.Danika;
import com.example.users.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TaskRunner implements ActionObject {

    private User user;

    public TaskRunner(User user){
        this.user = user;
    }

    @Override
    public ActionObject loginAs(User user) {
        $(byText("Portal Login")).click();
        $("#username").setValue(user.getUsername());
        $("#password").setValue(user.getPassword()).pressEnter();
        return this;
    }

    @Override
    public ActionObject performSearch(User user) {
        $("#search").click();
        $("#search").setValue(user.getInterest()).pressEnter();
        $("#mainContent").shouldHave(text("Search Results"));
        return this;
    }


}
