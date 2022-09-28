package LAB9;

import java.io.IOException;
import java.security.InvalidParameterException;

public class TestException {
    public static void main(String[] args)  {
        try {
            throwException(200);
        }
         catch(IOException | InvalidParameterException e){
             System.out.println(e.getMessage());
            }

    }
    public static void throwException(int n)throws InvalidParameterException, IOException{
        if(n<=0) {
            throw new InvalidParameterException("parameter must be greater than zero");
        }
        if(n>100){
            throw new IOException("parameter must be smaller than 100");
        }
        System.out.println(n*n);
    }
}
