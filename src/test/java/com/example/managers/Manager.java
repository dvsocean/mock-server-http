package com.example.managers;

import com.example.actions.Search;
import com.example.pages.HomePage;

public class Manager {

  private HomePage homePage;
  private Search search;

  public Manager() {
    homePage = new HomePage();
    search = new Search();
  }

  public HomePage onTheHomePage(){
    return homePage;
  }
}
