package exem;

/**
 * Created by Kailend on 01.08.2016.
 */
public class ShowString {

    public static void main(){
        String temp="I will pass exem";
        String secondString="100 %";

        int lenght=temp.length(); // длина строки
        System.out.println(temp.equals(secondString)); // сравнивает вде строки по содержанию
        temp.substring(0); // выризает строку начина с нулевого индекса
        int index=temp.indexOf("I"); // возвращает индекс симовала I
        temp=temp.trim(); // удаляет все пробелы в начале и концу строки
        temp.replace("I","i");// меняет первый символ на второй
        temp=temp.toLowerCase(); // понижает литерал строки (все с маленькой буквы)
        String [] array=temp.split(" "); //  создает массив строки , разделяя по пробелу
        temp=temp.toUpperCase(); //повышает литерал (все с болькой буквы
        System.out.println(temp.compareTo(secondString)); // сравнивает две строки лексеграфически, возвращает число
        System.out.println(temp.equalsIgnoreCase(secondString)); // сравнивает две строки игнорирую литерал


    }
}
