package Patterns;

public class second {
    public static void main(String[] args) {
        /* *
           **
           ***
           *****
           ***
           **
           *
         */
        int i;
        int j;
        int n =7;
        for(i=0;i<n;i++) {
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }

