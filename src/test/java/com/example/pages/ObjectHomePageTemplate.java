package com.example.pages;

import com.example.interfaces.ObjectInterface;
import com.example.users.User;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ObjectHomePageTemplate implements ObjectInterface {


    @Override
    public ObjectInterface login(User user) {
        $(byText("Portal Login")).click();
        $("#username").setValue(user.getUsername());
        $("#password").setValue(user.getPassword()).pressEnter();
        return this;
    }

    @Override
    public ObjectInterface andVerifyLoginBy(String verifyText) {
        $(By.linkText("Mountie Mail")).shouldHave(text(verifyText));
        return this;
    }
}
