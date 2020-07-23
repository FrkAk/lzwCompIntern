package jbr.springmvc.dao;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public interface UserDao {

  //boolean registerRedis(User user);

  int register(User user);

  User validateUser(Login login);
}
