package com.example.selectors;

import com.example.interfaces.ActionObject;
import com.example.interfaces.SelectorObjects;
import com.example.users.User;

public class DesktopRunner implements SelectorObjects {

    @Override
    public ActionObject getInterfaceForHomePage(User user) {
        return new TaskRunner(user);
    }
}
