package com.example.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.example.interfaces.HomePageActionsInterface;
import com.example.users.User;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage implements HomePageActionsInterface {

    private SelenideElement enterCredentials = $(byText("Portal Login"));
    private SelenideElement usernameInputField = $("#username");
    private SelenideElement passwordInputField = $("#password");
    private String pageTitle = WebDriverRunner.getWebDriver().getTitle();


    @Override
    public HomePageActionsInterface login(User user) {
        enterCredentials.click();
        usernameInputField.setValue(user.getUsername());
        passwordInputField.setValue(user.getPassword());
        return this;
    }


}
