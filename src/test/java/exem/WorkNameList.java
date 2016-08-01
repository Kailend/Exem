package exem;

import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kailend on 01.08.2016.
 */
public class WorkNameList {

    @org.testng.annotations.Test
    public void delNameWhithS(){
        List<String>list=new ArrayList<>();
        list.add("Semen");
        list.add("Ivan");
        list.add("Ketuy");
        list.add("Serg");

        System.out.println(list);
        for (int i=0;i<list.size();i++){

            if(list.get(i).toString().contains("S")){
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}
