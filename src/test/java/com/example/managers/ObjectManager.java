package com.example.managers;

import com.example.pages.ObjectHomePageTemplate;
import com.example.users.Danika;

public class ObjectManager {

    private ObjectHomePageTemplate objectHomePageTemplate;

    public ObjectManager() {
        this.objectHomePageTemplate = new ObjectHomePageTemplate();
    }

    public ObjectHomePageTemplate onTheHomePage(){
        return objectHomePageTemplate;
    }
}
