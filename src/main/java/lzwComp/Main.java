package lzwComp;


import lzwComp.app.userDB;
import lzwComp.database.redisDB;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");
        System.out.println("hello zey");
        System.out.println("Hello Frkn");

        userDB userdb = new userDB();

        userdb.setUser("testUser1", "test123");
        for(int i = 0 ; i <10; i++){
            String username= "testUser"+ Integer.toString(i);
            String password= "test"+ Integer.toString((int) getRandomIntegerBetweenRange(0,1000));
            userdb.setUser(username,password);
        }

    }

    public static double getRandomIntegerBetweenRange(double min, double max){
        return (int)(Math.random()*((max-min)+1))+min;
    }

}
