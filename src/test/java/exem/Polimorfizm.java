package exem;

/**
 * Created by Kailend on 01.08.2016.
 */
public class Polimorfizm {
   private String name;
    private int age;

    Polimorfizm(String name,int age ){
    this.name=name;
        this.age=age;
    }
    Polimorfizm(){
        name="User";
        age=0;
    }

    public void vivod (String str){
        System.out.println(str);
    }

    public void vivod(){
        System.out.println();
    }

}


    class ChildPolimorf extends Polimorfizm{
        ChildPolimorf(String name,int age){
            super(name,age);
        }

    }