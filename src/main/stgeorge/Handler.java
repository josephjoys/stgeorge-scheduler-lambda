package stgeorge;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Integer, String>{
    @Override
    public String handleRequest(Integer count, Context context) {
        return String.valueOf(count);
    }
}
