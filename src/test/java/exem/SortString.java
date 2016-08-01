package exem;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Semaphore;

/**
 * Created by Kailend on 01.08.2016.
 */
public class SortString {


    @Test
    public void hack(){
        List<String> list= new ArrayList<>();
        List<String > sort=new ArrayList<>();
        Set<String> set;
        list.add("b");
        list.add("a");
        list.add("c");
        boolean boo=true;
        set=new TreeSet<>(list);
        list.clear();
        list=new ArrayList<>(set);
        for (int i=0;i<list.size();i++);
        int g = list.size();
        for (int i = 0; i < list.size(); i++) {
            sort.add(list.get(g-i-1));
        }
        System.out.println(sort);


    }

}
