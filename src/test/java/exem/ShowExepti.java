package exem;

import org.testng.annotations.*;
import org.testng.annotations.Test;

/**
 * Created by Kailend on 01.08.2016.
 */
public class ShowExepti {


    @org.testng.annotations.Test
    public void workTry(){

        int a=10;
        int b=0;
        int result;
        try {
            result=a/b;
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }


    @Test
    public void workThrows()throws ArithmeticException{
        int a=10;
        int b=0;
        int result;
        result=a/b;
    }

}
