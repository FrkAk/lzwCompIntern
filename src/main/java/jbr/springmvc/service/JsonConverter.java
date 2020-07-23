package jbr.springmvc.service;

import com.google.gson.Gson;
import jbr.springmvc.model.User;

import java.lang.reflect.Type;

public class JsonConverter {

    Gson gson= new Gson();

    public Object jsonToObject(String json, Object anyObject){

        return gson.fromJson(json, (Type) anyObject);

    }

/*
    public static void main(String[] args) {

        User u= new User("testuser", "test123", "testFirst",
                "testLast","testMail","testAddres",1548545);

        JsonConverter con = new JsonConverter();
        User json = (User)con.jsonToObjectForUser(u.toString(), User.class);

        System.out.println(json);




    }*/

}




