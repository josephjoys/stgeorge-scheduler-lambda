import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import stgeorge.Handler;

public class HandlerTest extends TestCase {
    @Test
    public void testHandler(){
        Handler handler  = new Handler();
        Assert.assertEquals(handler.handleRequest(2,null),Integer.toString(2));
    }
}
