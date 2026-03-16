package Patterns;

public class second {
    public static void main(String[] args) {
        /*    *
             ***
            *****
           *******
          *********
          *********
           *******
            *****
             ***
              *
         */
        int i;
        int j;
        int n = 4;
        for(i=0;i<n;i++){
            //space
            for(j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            //stars
            for(j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

            //these two space loops were printing the pattern besides each other instead of in continuation
           /* //space
            for(j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            for(j=0;j<i;j++){
                System.out.print(" ");
            }  */
            //we'll make another outer loop for the inverted pyramid
            for(i=0;i<n;i++){
                for(j=0;j<i;j++){
                    System.out.print(" ");
                }
                for(j=0;j<2*n-2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

