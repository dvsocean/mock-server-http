package com.example.interfaces;

import com.example.users.User;

public interface ObjectInterface {

    ObjectInterface login(User user);

    ObjectInterface andVerifyLoginBy(String text);
}
