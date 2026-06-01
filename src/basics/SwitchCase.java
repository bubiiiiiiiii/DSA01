package basics;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //basic knowledge
        /*  switch(expression){
            case1 :
            //do something
            break;
            default:
                //do something */

        /*note:
        1. cases have to be the same type as expression must be constant or literal
        2. if break is not used it will continue to the next case
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter fruit:");
        String fruit = sc.nextLine();

        //now for a new enhanced way we can just go over on switch and do "alt + enter"
        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "orange" -> System.out.println("mehh");
            default -> System.out.println("not a fruit");
            /* what changed??
            1. no extra curly braces.
            2. don't need break statement.
             */
        }
    }
}






