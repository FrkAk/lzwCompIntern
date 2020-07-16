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
import org.redisson.config.Config;;
import org.redisson.api.RedissonClient;
import org.redisson.config.TransportMode;

public class redisDB {

    public static void client(){
        System.out.println("Connection Initiated");
        Config config = new Config();
        config.setTransportMode(TransportMode.EPOLL);
        config.useClusterServers()
                // use "rediss://" for SSL connection
                .addNodeAddress("redis://10.10.10.228:6379");


        RedissonClient redisson = Redisson.create(config);



        System.out.println("Connection Successful");
    }

}




