package exem;

import org.testng.annotations.*;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Kailend on 01.08.2016.
 */
public class TestBreakReturn {

    public boolean show(){
        return true;
    }



    @org.testng.annotations.Test
    public void letsGo(){
        for (int i=0;i<10;i++){
            if (i==5){
                break;
            }
        }

    }
}
