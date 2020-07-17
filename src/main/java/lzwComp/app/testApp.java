package lzwComp.app;

// import the rest service you created!
import lzwComp.rest.restService;
import lzwComp.rest.restService;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class testApp extends Application {
    private Set<Object> singletons = new HashSet<Object>();
    public testApp() {
        // Register our hello service
        singletons.add(new restService());
    }
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}