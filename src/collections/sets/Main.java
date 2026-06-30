package collections.sets;

/*
* Set is an interface within the Java Collections Framework (part of the java.util package)
 that represents an unordered collection of unique elements. This means a Set cannot contain duplicate values.
* If an attempt is made to add a duplicate element, the Set will ignore it, and its content will remain
 unchanged.

* Key characteristics of Java Sets:**

1. Uniqueness: They store only unique elements.
2. Unordered (generally): Set implementations typically do not guarantee any specific order of elements,
  though some implementations like LinkedHashSet preserve insertion order and TreeSet orders elements
 based on their natural ordering or a custom Comparator.
3. No Index-based Access: Elements cannot be accessed by an index, unlike List implementations.
4. Mathematical Set Abstraction: They model the mathematical concept of a set, allowing for operations
like union, intersection, and difference.

**Common Implementations of the Set Interface:**
- HashSet: The most common and generally best-performing implementation. It stores elements in a
 hash table and offers fast operations, but it does not guarantee any order of elements.
- LinkedHashSet: This implementation maintains the insertion order of elements. It uses a hash table
*  for storage and a linked list to maintain the order.
- TreeSet: This implementation stores elements in a sorted order, either based on their natural ordering
* (if elements implement Comparable) or a custom Comparator. It is based on a red-black tree data structure,
* making it slower than HashSet for basic operations but providing ordered iteration.*/

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>();

        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice");
        uniqueNames.add("Munga");
        uniqueNames.add("Javan");

        for (String names : uniqueNames) //Alice will be printed only once
            System.out.println(names);

        //check for a user inserting a duplicate value
        Set<String> emails = new HashSet<>();
        String[] userEmails= {"maz@gmail.com ",
                                "dennis@gmail.com",
                                "maz@gmail.com",
                                "njogos@gmail.com",
                                "kIOKO@gmail.com",
                                "kioko@gmail.com"};

        for(String userEmail : userEmails){
            userEmail = userEmail.trim().toLowerCase();  //normalize emails b4 adding to loop
            if(!emails.add(userEmail)){
                System.out.println("\nDuplicate email '" + userEmail + "' found!");
            }
        }

        System.out.println("emails: " + emails);



        System.out.println("\nHash code for the entire set: " + uniqueNames.hashCode());

        System.out.println("\n hash code for each value:");
        for (String names : uniqueNames)
            System.out.println(names + ": " + names.hashCode());


        // remove()
        uniqueNames.remove("Alice");
        System.out.println("\nAfter removing \"Alice:\" \n");

        for (String names : uniqueNames)
            System.out.println(names);


    }
}
