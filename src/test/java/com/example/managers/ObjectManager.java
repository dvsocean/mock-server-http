package com.example.managers;

import com.example.pages.ObjectHomePageTemplate;
import com.example.users.Danika;

public class ObjectManager {

    public Danika danika;
    public ObjectHomePageTemplate objectHomePageTemplate;

    public ObjectManager() {
        this.objectHomePageTemplate = new ObjectHomePageTemplate();
        this.danika = new Danika();
    }

    public ObjectHomePageTemplate onTheHomePage(){
        return objectHomePageTemplate;
    }
}
