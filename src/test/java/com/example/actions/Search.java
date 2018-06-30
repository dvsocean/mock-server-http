package com.example.actions;

import com.example.users.Danika;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Search {

    public void searchDatabaseFor(Danika danika) throws InterruptedException {
        $(By.id("q")).setValue(danika.getInterest());
        Thread.sleep(3000);
    }

}
