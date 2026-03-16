package Patterns;

public class second {
    public static void main(String[] args) {
        /*
        "    *
            ***
           *****
          *******
         *********
         */
        int i;
        int j;
        int n = 5;
        for(i=0;i<n;i++){
            //space
            for(j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            //stars
            for(j=0;j<2*i+1;j++) {
                System.out.print("*");
            }
            //space
            for(j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
