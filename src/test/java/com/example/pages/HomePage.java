package com.example.pages;

import com.example.users.Danika;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

  public void loginToSchoolPortalFor(Danika danika) throws InterruptedException {
    $(byText("Portal Login")).click();
    $(byName("username")).setValue(danika.getMtSacUserName());
    $(byName("password")).setValue(danika.getMtSacPassword()).pressEnter();
    Thread.sleep(3000);
  }

}
