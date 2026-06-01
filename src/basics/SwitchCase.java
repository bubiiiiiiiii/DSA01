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

        //this is the old boring wayyyyy
        switch(fruit){
            case "mango":
                System.out.println("king of fruits");
                break;
            case "orange":
                System.out.println("mehh");
                break;
            default:
                System.out.println("not a fruit");
        }
    }
}






