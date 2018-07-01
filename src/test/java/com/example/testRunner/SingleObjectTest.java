package com.example.testRunner;

import com.example.Base;
import com.example.managers.ObjectManager;
import com.example.users.Danika;
import org.testng.annotations.Test;

public class SingleObjectTest extends Base {

    Danika danika = new Danika();

    @Test(dataProvider = "data1")
    public void veryifyUserAuthentication(ObjectManager manager){
        manager.onTheHomePage().login(danika).andVerifyLoginBy("Mountie Mail");
    }
}
