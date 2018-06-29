package com.example.managers;

import com.example.interfaces.SelectorObjects;
import com.example.pages.HomePage;

public class ApplicationManager {

  HomePage homePage;

  public ApplicationManager(SelectorObjects selectorObjects) {
    homePage = new HomePage(selectorObjects.getSelectorsForHomePage());
  }
}
