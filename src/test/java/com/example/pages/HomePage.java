package com.example.pages;

import com.example.interfaces.ActionObject;

public class HomePage {

  private final ActionObject action;

  public HomePage(ActionObject actionObject){
    this.action = actionObject;
  }

  public HomePage findProduct(String search){
    action.searchFor(search);
    return this;
  }

}
