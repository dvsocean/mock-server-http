package com.example.pages;

import com.example.users.Danika;
import com.example.users.User;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

  public void loginToSchoolPortalFor(User user) throws InterruptedException {
    $(byText("Portal Login")).click();
    $(byName("username")).setValue(user.getDanika().getMtSacUserName());
    $(byName("password")).setValue(user.getDanika().getMtSacPassword());
    Thread.sleep(3000);
  }

}
