package com.java;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MainHandler implements RequestHandler<Integer, String> {
    public String handleRequest(Integer myCount, Context context) {
        return String.valueOf(myCount);
    }
}
