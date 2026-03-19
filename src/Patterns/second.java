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
           for(j='A';j<'A'+ i;j++){
               System.out.print(j);
           }
           System.out.println();
       }

        }

    }

