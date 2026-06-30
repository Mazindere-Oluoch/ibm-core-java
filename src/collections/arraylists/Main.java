package collections.arraylists;

import java.util.ArrayList;
import java.util.List;

/*
* wrapper classes such as Integer provide a way to treat primitive data as objects which is necessary
* for certain Java features such as using them with collections such as ArrayList and Hashmaps
 */
public class Main {
    public static void main(String[] args) {
        String number = "123";
        int x = Integer.parseInt(number);
        System.out.println(x+20);

        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("dennis nderitu");
        studentNames.add("mazindere oluoch");
        studentNames.add("otorongo jogothe");
        studentNames.add("ng'oe wairimu");

        System.out.println(studentNames);

      //  studentNames.remove(1);
        System.out.println(studentNames);
        System.out.println("size of the ArrayList: " + studentNames.size());
        System.out.println("at index 0: " + studentNames.get(0));

        //using ListOf- unmodifiable collection- cant modify (add, remove etc)
        List<Integer> numbers = List.of(1,2,3,4,5);
        System.out.println("using unmodifiable list:");
        numbers.forEach(n-> System.out.println(n));



    }

}
