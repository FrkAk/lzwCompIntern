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

    public static void client(){
        System.out.println("Connection Initiated");

        Config config = new Config();
        config.setTransportMode(TransportMode.NIO);
        config.useSingleServer()
                // use "rediss://" for SSL connection
                .setAddress("redis://10.10.10.228:6379");


        RedissonClient redisson = Redisson.create(config);



        RBucket<String> bucket = redisson.getBucket("stringObject");
        bucket.set("This is the object value");

        RMap<String, String> Map = redisson.getMap("theMap");
        Map.put("mapKey", "LZW is map value");

        String objValue = bucket.get();
        System.out.println("The object value is: " + objValue);
        String mapValue = (String) Map.get("mapKey");
        System.out.println("The map value is: " + mapValue);
        redisson.shutdown();


        System.out.println("Connection Successful");
    }

}




