package jbr.springmvc.dao;


import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.TransportMode;

;

public class redisDB {
    private Config config;
    private RedissonClient redisson;
    private RBucket<String> bucket;
    private RMap<String, String> map;

    public redisDB() {
        System.out.println("Connection Initiated");

        config = new Config();
        config.setTransportMode(TransportMode.NIO);
        config.useSingleServer()
                // use "rediss://" for SSL connection
                .setAddress("redis://10.10.10.228:6379");


        redisson = Redisson.create(config);

        System.out.println("Connection Successful");
    }

    public void setBucket(String bucketName, String value) {

        bucket = redisson.getBucket(bucketName);
        bucket.set(value);
    }
    public void setMap(String mapName, String mapKey , String value){
        map = redisson.getMap(mapName);
        map.put(mapKey, value);
    }

    public String getBucket(String bucketName){
        bucket = redisson.getBucket(bucketName);
        return bucket.get();
    }

    public String getMap(String mapName, String mapKey){
        map = redisson.getMap(mapName);
        return (String) map.get(mapKey);
    }

    public boolean isExist(String mapName, String mapKey){
        String returnValue = getMap(mapName,mapKey);
        if (returnValue == null)
            return false;
        else return true;

        //return !getMap(mapName, mapKey).equals("null");
    }

    public void disconnect(){
        System.out.println("Disconnected");
        redisson.shutdown();

    }


}




