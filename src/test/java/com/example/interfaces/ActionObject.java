package com.example.interfaces;

import com.example.users.User;

public interface ActionObject {

  ActionObject loginAs(User user);

  ActionObject performSearch(User user);

}
