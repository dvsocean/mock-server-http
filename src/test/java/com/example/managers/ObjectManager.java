package com.example.managers;

import com.example.pages.HomePage;

public class ObjectManager {

    private HomePage homePage;

    public ObjectManager() {
        this.homePage = new HomePage();
    }

    public HomePage onTheHomePage(){
        return homePage;
    }
}
