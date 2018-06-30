package com.example.pages;

import com.example.interfaces.ActionObject;
import com.example.users.User;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

  ActionObject action;

  public HomePage(ActionObject action){
    this.action = action;
  }

  public void loginToSchoolPortalFor(User user) throws InterruptedException {

    Thread.sleep(3000);
  }

}
