package com.example.pages;

import com.example.interfaces.ActionObject;
import com.example.users.User;

public class HomePageTemplate {

  private ActionObject action;

  public HomePageTemplate(ActionObject action){
    this.action = action;
  }

  public void loginToSchoolPortalFor(User user) {
    action.loginAs(user);
  }

  public void find(User user){
    action.performSearch(user);
  }




}
