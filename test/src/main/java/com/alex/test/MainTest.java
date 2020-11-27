package com.alex.test;

import com.alex.test.dao.UserDao;
import com.alex.test.entry.User;

public class MainTest {
  public static void main(String[] args) {

    UserDao userDao = new UserDao();
    User user = new User();
    user.setUsername("wwwttt");
    user.setPassword("33333");

    if (userDao.insert(user) == 1) {
      System.out.println("insert success...");
    }else{
      System.out.println("insert fail...");
    }
  }
}
