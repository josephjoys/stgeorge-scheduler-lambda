import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import stgeorge.Handler;
import utils.TestUtils;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HandlerTest extends TestCase {

    @Before
    public void setUp() {

    }

    @Test
    public void testHandler(){
        try{
            Handler handler  = new Handler();
            handler.handleRequest(TestUtils.getTesEvent(),null);
        }catch (Exception e){
           Assert.assertTrue(e instanceof InvalidParameterException);
        }

    }
}
