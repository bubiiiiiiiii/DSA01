package Patterns;

public class second {
    public static void main(String[] args) {
        /*a
          ab
          abc
          abcd
         */
        int i;
        char j;
        int n=5;

       for(i=1;i<n;i++){
           char ch = (char)('A'+i-1);
           for(j=1;j<=i;j++){
               System.out.print(ch);
           }
           System.out.println();
       }

        }

    }

