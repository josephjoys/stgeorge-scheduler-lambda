package stgeorge.validator;

import java.util.Map;

public class LambdaValidator implements Validator{
    private Map<String,String> inputData;
    public LambdaValidator(Map<String,String> data){
        inputData = data;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
