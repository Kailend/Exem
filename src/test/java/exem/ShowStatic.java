package exem;

/**
 * Created by Kailend on 01.08.2016.
 */
class Test {
    static int result=10;
    public static void workOne(){
        System.out.println(result);
    }
}

    class Test2{
    @org.testng.annotations.Test
        public static void zapusk(){
        System.out.println(Test.result);
    }

}