package exem;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.util.*;

/**
 * Created by Kailend on 01.08.2016.
 */
public class Collection {

    @org.testng.annotations.Test
    public void letsSet(){

        Set<String> set=new HashSet<>();  // Доступ к элементу по хешкоду
        Set<String> setHash=new TreeSet<>(); // Упорядоченное множество по лексеграфическому принципу
        Set<String> setLin=new LinkedHashSet<>(); // Добавляет элементы по очереди
    }

    @Test
    public void letsMap(){
        Map<Integer,String>map=new HashMap<>();

        for (int i=0;i<10;i++)
            map.put(i,"Map");

        for (Map.Entry<Integer,String>pair:map.entrySet()){
            int key=pair.getKey();
            String res=pair.getValue();
            System.out.println(key+" "+res);
        }

        Iterator<Map.Entry<Integer,String>> iteratorOne=map.entrySet().iterator();

        while (iteratorOne.hasNext()){
            Map.Entry<Integer,String>res=iteratorOne.next();
            int key=res.getKey();
            String aa=res.getValue();
            System.out.println(key+"@@"+aa);

        }
    }


}
