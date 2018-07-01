package com.example.managers;

import com.example.interfaces.SelectorObjects;
import com.example.pages.HomePageTemplate;
import com.example.users.User;

public class InstanceManager {

  private HomePageTemplate homePageTemplate;

  private final User user;

  public InstanceManager(SelectorObjects selectorObjects) {
    this.user = new User();
    this.homePageTemplate = new HomePageTemplate(selectorObjects.getInterfaceForHomePage(user));
  }

  public HomePageTemplate onTheFrontPage(){
    return homePageTemplate;
  }

}
