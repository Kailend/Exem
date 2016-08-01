package exem;

import org.testng.annotations.*;

/**
 * Created by Kailend on 01.08.2016.
 */
public class DataProv {

    @DataProvider(name = "show")
    public Object[][] facebook(){
        return new Object[][]{
                {"Work"},
                {"alalal"},
                {"go!"},
        };
    }


    @org.testng.annotations.Test(dataProvider = "show")
    public void dataShow(String str){
        System.out.println(str);
    }
}
