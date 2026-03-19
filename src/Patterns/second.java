package Patterns;

public class second {
    public static void main(String[] args) {
        /*1
          2 3
          4 5 6
          7 8 9 10
          11 12 13 14 15
         */
        int i;
        int j;
        int n=5;
        int num=0;
       for(i=1;i<n;i++){//so when i do i=0 there's a gap in the output thats cuz when i=0 then goes into inner loop
           //j<i that means j<0 and j=0 not possible condition becomes false so no output gets printed but
           for(j=0;j<i;j++){
               num = num + 1;
               System.out.print(num + " ");
           }
           System.out.println(); //this line still prints leaving an empty line there
           //that's why instead of i=0 we'll do i=1
       }

        }

    }

