package com.example.testRunner;

import com.example.Base;
import com.example.managers.ObjectManager;
import com.example.users.Danika;
import org.testng.annotations.Test;

public class SingleObjectTest extends Base {

    private Danika danika = new Danika();

    @Test(dataProvider = "accessData")
    public void veryifyUserAuthentication(ObjectManager manager) {
        manager.onTheHomePage().login(danika);
    }
}
