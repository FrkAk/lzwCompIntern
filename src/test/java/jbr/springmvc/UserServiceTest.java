package jbr.springmvc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:jbr/config/user-beans.xml" })
public class UserServiceTest {

  @Autowired
  private UserService userService;

  @Test
  public void testRegister() {
    User user = new User();
    user.setUsername("TestRedisOnCode");
    user.setPassword("TestRedisOnCode123");
    user.setFirstname("TestRedisOnCodeFirst");
    user.setLastname("TestRedisOnCodeLast");
    user.setAddress("TestRedisOnCode Address");
    user.setEmail("TestRedisOnCode@gmail.com");
    user.setPhone(123456789);

    int result = userService.register(user);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testValidateUser() {
    Login login = new Login();
    login.setUsername("ranjith");
    login.setPassword("sekar");

    User user = userService.validateUser(login);
    Assert.assertEquals("Ranjith", user.getFirstname());
  }

}
