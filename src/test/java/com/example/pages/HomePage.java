package com.example.pages;

import com.example.interfaces.ActionObject;
import com.example.users.User;

public class HomePage {

  private final ActionObject action;

  public HomePage(ActionObject action){
    this.action = action;
  }

  public HomePage loginToSchoolPortalFor(User user) throws InterruptedException {
    action.loginAs(user);
    Thread.sleep(3000);
    return this;
  }

}
