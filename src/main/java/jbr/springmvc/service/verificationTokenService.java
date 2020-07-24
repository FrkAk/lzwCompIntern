package jbr.springmvc.service;

import jbr.springmvc.model.User;

import java.security.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class verificationTokenService {

    private static final int ExpirationTime= 60 * 24;
    private User user;
    private String token;

    private Date expiryDate;

    public static int getExpirationTime() {
        return ExpirationTime;
    }

    public User getUser() {
        return user;
    }

    public String getToken() {
        return token;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }


    public void setUser(User user) {
        this.user = user;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }


    public String generateVerificationToken(User user){

        user.setEnabled(false);








        return null;
    }








}
