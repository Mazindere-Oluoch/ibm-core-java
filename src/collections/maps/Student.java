package collections.maps;
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
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public Student() {
        this.id = -1;
        this.name = "not found";
        this.marks = -1;
    }

    public static void main(String[] args) {
        //todo - computeIfAbsent, ifPresent
        Map<String, Student> students = new HashMap<>();

        students.put("Dennis", new Student(1, "Dennis Nderitu", 80));
        students.put("Scar", new Student(2, "Scar Mkadinali", 40));
        students.put("Eve", new Student(3, "Eve Mungai", 70));
        students.put("Sewer", new Student(4, "Sewer Sydaa", 30));
        students.put("Dosh", new Student(5, "Munga Mkadinali Wuzu", 65));


//        printing the students
        System.out.println("\n" + students);

        //  getting the size
        System.out.println("\nno. of students: " + students.size());

        System.out.println("\n**printing keys using enhanced for loop: **");

        for (String keys : students.keySet()) {
            System.out.println(keys);
        }

        System.out.println("\n**printing values using enhanced for loop: **");

        for (Student values : students.values()) {
            System.out.println(values);
        }

//        entry set- combination of key n value
        System.out.println("\n**printing entry set:**\n" + students.entrySet());


//        remove
        students.remove("Scar");
        System.out.println("\nafter removing key Scar..\n" + students);
        System.out.println("no. of students after the above remove(): " + students.size());

//        Given a student’s name, print their mark.
        System.out.println("\nRecords for Dosh: " + students.get("Dosh"));

//        to fetch a record that does not exist we can use the following (can also use Optional)
        System.out.println("\nRecords for a non existing student: " + students.getOrDefault("ken", new Student()));

        //adding an element
        students.put("Nicodemus", new Student(6, "Nicodemus kiko Mutinda", 25));

//      CHECK PREV CODE VERSION  Find and print the student with the highest mark.
        /*System.out.println("\nFind and print the student with the highest mark");
        int max = 0;
        for (String studentMark : students.keySet()) {
            System.out.println(studentMark + ": " + students.get(studentMark));
            if (students.get(studentMark) > max) {
                max = students.get(studentMark);
            }

        }
        System.out.println("HIGHEST MARK: " + max);*/

//        Count how many students scored above 50.
       /* System.out.println("\nCount how many students scored above 50.");
        int counter = 0;
        for (String studentName : students.keySet()) {
            if (students.get(studentName) > 50) {
                counter++;
                System.out.println(studentName + ": " + students.get(studentName));
            }

        }

        System.out.println("students with marks greater than 50: " + counter);*/


    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", marks=" + marks + '}';
    }
//    getters n setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


}
