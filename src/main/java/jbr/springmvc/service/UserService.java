package jbr.springmvc.service;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public interface UserService {

  int register(User user);

  //boolean registerRedis(User user);

  User validateUser(Login login);
}
