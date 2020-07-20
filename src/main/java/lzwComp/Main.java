package lzwComp;


import lzwComp.database.redisDB;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");
        System.out.println("hello zey");
        System.out.println("Hello Frkn");

        redisDB db = new redisDB();

        db.setMap("testMap","m1" ,"This is a test1");
        db.setMap("testMap","m2" ,"This is a test2");
        db.setMap("testMap","m3" ,"This is a test3");
        db.setMap("testMap","m4" ,"This is a test4");
        db.setMap("testMap","m5" ,"This is a test5");
        db.setMap("testMap","m6" ,"This is a test6");

        db.getMap("testMap", "m7");


        db.disconnect();



    }

}
