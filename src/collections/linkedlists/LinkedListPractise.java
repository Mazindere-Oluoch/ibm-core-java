
package collections.linkedlists;

//using a (to_do) to learn about linked lists ->QUEUE

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListPractise {
    //add a task
    //remove
    //view

    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1.Add a task\t2.View all tasks\t3.Remove a task\t4.Close the app\n\tEnter your choice:");
            if(!scanner.hasNextInt()){
                System.out.println("Error, select an item from the menu");
                scanner.next();
            }
            else {

                int choice = scanner.nextInt(); //user enters a choice
                scanner.nextLine(); // Consume the leftover newline

                /*
                 * You need to consume the newline only because scanner.nextInt()
                 * (and similar methods like nextDouble(), next() etc.) do not consume the newline
                 * (\n) after reading a number or word.*/

                switch (choice) {
                    case 1:
                        System.out.print("Enter a task: ");
                        //String variable for storing task entered by user
                        String task = scanner.nextLine();
                        tasks.addLast(task);
                        break;

                    case 2:
                        if (!tasks.isEmpty()) {
                            System.out.println("displaying all tasks:");
                            for (String t : tasks) {
                                System.out.println(t);
                            }
                            System.out.println();

                        } else {
                            System.out.println("no task to display");
                        }
                        break;

                    case 3:
                        if (!tasks.isEmpty()) {
                            System.out.println("removed " + tasks.removeFirst());
                        } else {
                            System.out.println("no task to remove");

                        }
                        break;

                    case 4:
                        System.out.println("closing...");
                        System.exit(0);

                }
            }
        }

    }

}

