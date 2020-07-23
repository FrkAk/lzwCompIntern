package jbr.springmvc.model;

public class User {

  private String username;
  private String password;
  private String firstname;
  private String lastname;
  private String email;
  private String address;
  private String status="User";
  private int phone;


  /*public User(String username, String password, String firstname,
              String lastname, String email, String address, int phone) {
    this.username = username;
    this.password = password;
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.address = address;
    this.phone = phone;
  }*/



  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getEmail() {
    return email;
  }

  public String getAddress() {
    return address;
  }

  public int getPhone() {
    return phone;
  }


  public void setUsername(String username) {
    System.out.println("username: " + username);
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setFirstname(String firstname) {
    System.out.println("firstname: " + firstname);
    this.firstname = firstname;
  }

  public void setLastname(String lastname) {
    System.out.println("lastname: " + lastname);
    this.lastname = lastname;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "{ username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            ", email='" + email + '\'' +
            ", address='" + address + '\'' +
            ", status='" + status + '\'' +
            ", phone=" + phone +
            '}';
  }


}
