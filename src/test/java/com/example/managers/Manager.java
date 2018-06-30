package com.example.managers;

import com.example.actions.Login;
import com.example.pages.HomePage;

public class Manager {

  private HomePage homePage;
  private Login login;



  public Manager() {
    homePage = new HomePage();
  }



  public HomePage onTheHomePage(){
    return homePage;
  }

  public Login onLogin(){
    return login;
  }
}
