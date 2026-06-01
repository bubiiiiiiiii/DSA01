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

        // nested switch case
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.next();

        switch(empId){
            case 1:
                System.out.println("bubi");
                break;
            case 2:
                System.out.println("bubii");
                break;
            case 3:
                switch(department){
                    case "it":
                        System.out.println("in it department");
                        break;
                        case "tech":
                            System.out.println("in tech department");
                    default:
                        System.out.println("beeeeeeeeep!!");
                        break;
                    }
            default:
                System.out.println("wrong");
                }
        }

    }







