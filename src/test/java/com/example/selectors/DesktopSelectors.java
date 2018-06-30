package com.example.selectors;

import com.example.interfaces.ActionObject;
import com.example.interfaces.SelectorObjects;
import com.example.users.User;

public class DesktopSelectors implements SelectorObjects {

    @Override
    public ActionObject getSelectorsForHomePage(User user) {
        return new DesktopHomePageSelectors(user);
    }
}
