package com.example.managers;

import com.example.interfaces.SelectorObjects;
import com.example.pages.HomePage;
import com.example.users.Danika;
import com.example.users.User;

public class Manager {

  private HomePage homePage;

  User user = new User();

  public Manager(SelectorObjects selectorObjects) {
    homePage = new HomePage(selectorObjects.getSelectorsForHomePage(user));

  }

  public HomePage onTheHomePage(){
    return homePage;
  }

}
