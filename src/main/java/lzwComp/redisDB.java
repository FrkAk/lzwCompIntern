package lzwComp;


import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RMap;
import org.redisson.api.RSet;
import org.redisson.config.Config;;
import org.redisson.api.RedissonClient;
import org.redisson.config.TransportMode;

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
    public void setMap(String mapName, String value){
        map = redisson.getMap("theMap");
        map.put("mapKey", "LZW is map value");
    }

    public String getBucket(){
        String objValue = bucket.get();
        return objValue;
    }

    /**
        String objValue = bucket.get();
        System.out.println("The object value is: " + objValue);
        String mapValue = (String) map.get("mapKey");
        System.out.println("The map value is: " + mapValue);
        redisson.shutdown();


    }*/

}




