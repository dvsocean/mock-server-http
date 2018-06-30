package com.example.managers;

import com.example.interfaces.SelectorObjects;
import com.example.pages.HomePage;
import com.example.users.User;

public class Manager {

  private HomePage homePage;

  private final User user;

  public Manager(SelectorObjects selectorObjects) {
    this.user = new User();
    this.homePage = new HomePage(selectorObjects.getSelectorsForHomePage(user));

  }

  public HomePage onTheHomePage(){
    return homePage;
  }

}
