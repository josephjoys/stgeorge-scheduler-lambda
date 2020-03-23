package handler;

import com.java.MainHandler;
import org.junit.Assert;
import org.junit.Test;



public class MainHandlerTest {
    @Test
    public void TestHandler() {
        MainHandler handler = new MainHandler();
        Assert.assertEquals(handler.handleRequest(2,null),  "2");
    }
}
