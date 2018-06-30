package com.example.actions;

import com.example.users.User;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Login {

    private User user;

    public Login(User user){
        user = user;
    }

    public void asStudent(User user){
        $(byText("Portal Login")).click();
        $(byName("username")).setValue(user.getDanika().getMtSacUserName());
        $(byName("password")).setValue(user.getDanika().getMtSacPassword()).pressEnter();
    }

}
