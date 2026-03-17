package Patterns;

public class second {
    public static void main(String[] args) {
        /* 1
           0 1
           1 0 1
           0 1 0 1
           1 0 1 0 1
         */
        int i;
        int j;
        int n =5;
        int start = 1;
        for(i=0;i<n;i++) {
            if(i%2==0){
               start = 1;
            }else{
                start = 0;
            }
            for(j=0;j<=i;j++){
                System.out.print(start);
                start = 1 - start;  // this line is very important it flips the digit if 0 then 1 if 1 then 0
            }
            System.out.println();}
        }

    }

