package collections.hashmaps;
/* HashMaps- same as dictionary in python. Stores data in key-value pairs
 and keys must be unique, no duplicate keys. used whenever fast lookup is needed
   cz u just search using the key.

   2. Map vs. HashMap (The Variable Declaration)
You asked about the difference between these two ways of writing code:

Option A: Map<K, V> map = new HashMap<>(); (The Professional Way)
This is called coding to an interface. It makes your code flexible.
Benefit: If you realize later that you need the map to stay sorted, you only have to change one word:
 Map<K, V> map = new TreeMap<>();.
- The rest of your code won't break because it only cares that the object behaves like a Map.

Option B: HashMap<K, V> map = new HashMap<>();
This ties your variable specifically to a HashMap.
- Downside: You can only ever use HashMap methods. If you try to swap it for a TreeMap later,
the compiler might complain if you used any HashMap-specific shortcuts elsewhere in your code.

- you must choose a concrete class to do the actual work:
1. HashMap: Best for general use (fastest).
2. LinkedHashMap: Use this if you need to remember the order in which you added items.
3. TreeMap: Use this if you want the keys to be alphabetical or numerical.
4. WeakHashMap: A specialized map where entries can be removed by the "Garbage Collector"
 automatically (used for caching).*/

import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Dennis the legend", 92);
        studentMarks.put("Allan Njogothe", 92);
        studentMarks.put("Kelvin the lover boy", 76);
        studentMarks.put("Sunil mohammed", 48);
        studentMarks.put("Greyson marcus", 10);



//        printing the marks
        System.out.println("\n" + studentMarks);

        //  getting the size
        System.out.println("no. of students/size: " + studentMarks.size());


        System.out.println("\n**printing keys using enhanced for loop**\n");

        for (String keys : studentMarks.keySet()) {
            System.out.println(keys);
        }

        System.out.println("\n**printing values using enhanced for loop**\n");

        for (Integer values : studentMarks.values()) {
            System.out.println(values);
        }

//        remove
        studentMarks.remove("Sunil mohammed");
        System.out.println("after removing key sunil..\n" + studentMarks);
        System.out.println("no. of students after the above remove(): " + studentMarks.size());

//        Given a student’s name, print their mark.
        System.out.println("\nmarks for Greyson: " + studentMarks.get("Greyson marcus"));

        //adding an element
        studentMarks.put("Nicodemus", 90);

//        Find and print the student with the highest mark.
        System.out.println("\nFind and print the student with the highest mark");
        int max = 0;
        for (String studentMark : studentMarks.keySet()) {
            System.out.println(studentMark + ": " + studentMarks.get(studentMark));
            if (studentMarks.get(studentMark) > max) {
                max = studentMarks.get(studentMark);
            }

        }
        System.out.println("HIGHEST MARK: " + max);

//        Count how many students scored above 50.
        System.out.println("\nCount how many students scored above 50.");
        int counter = 0;
        for (String studentName : studentMarks.keySet()) {
            if (studentMarks.get(studentName) > 50) {
                counter++;
                System.out.println(studentName + ": " + studentMarks.get(studentName));
            }

        }

        System.out.println("students with marks greater than 50: " + counter);


    }


}
