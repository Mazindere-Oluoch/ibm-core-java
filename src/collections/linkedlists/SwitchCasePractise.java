package collections.linkedlists;

import java.util.Scanner;

public class SwitchCasePractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int code;
            System.out.println("\n**courses at MMU**\n1.227\t2.223\t3.225\t4.221\tpress 0 to exit\nEnter the code to see your course:");
            //capturing input from user and validating

            if(!sc.hasNextInt()){
                System.out.println("error! please enter an integer");
                sc.next(); //clear the scanner
            }
            else {
            code=sc.nextInt();

            if(code==0)
                System.exit(0);

            switch (code){
                case 227:
                    System.out.println("your course is SE");
                    break;
                case 223:
                    System.out.println("your course is CS");
                    break;
                case 225:
                    System.out.println("your course is CT");
                    break;
                case 221:
                    System.out.println("your course is IT");
                    break;
                default:
                    System.out.println("error, course not found");

            }

        }
    }}
}
