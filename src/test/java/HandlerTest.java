import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import stgeorge.Handler;

import java.util.HashMap;
import java.util.Map;

public class HandlerTest extends TestCase {
    @Test
    public void testHandler(){
        Handler handler  = new Handler();
        Map<String,String> event = new HashMap<>();
        event.put("key","value");
        Assert.assertEquals(handler.handleRequest(event,null),Integer.toString(1));
    }
}
