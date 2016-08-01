package exem;

import org.testng.annotations.*;

/**
 * Created by Kailend on 01.08.2016.
 */
public class Recursia {


    int fact(int n){
        int result;
        if(n==1)
            return 1;
        result=fact(n-1)*n;
        return result;

    }

    @org.testng.annotations.Test
    public void tryOne(){
        System.out.println(fact(10));

    }
}
