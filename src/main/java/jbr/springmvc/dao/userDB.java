package jbr.springmvc.dao;



public class userDB {

    public String getUsername(String mapName, String mapKeyUsername){

        redisDB db = new redisDB();
        String value= db.getMap(mapName, mapKeyUsername);
        db.disconnect();

        if(value.equals("null"))return "null";
        else return mapKeyUsername;
    }

    public String getPassword(String mapName, String mapKeyUsername){

        redisDB db = new redisDB();
        String valuePassword= db.getMap(mapName, mapKeyUsername);
        db.disconnect();

        if(valuePassword.equals("null"))return "null";
        else return valuePassword;
    }

    public void setUser(String mapKeyUsername, String mapValuePassword){
        redisDB db = new redisDB();
        db.setMap("lzwUsers",mapKeyUsername ,mapValuePassword);
        db.disconnect();
    }






}