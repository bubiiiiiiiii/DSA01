package Patterns;

public class second {
    public static void main(String[] args) {
        /*
        "*
         **
         ***
         ****
         *****
         */
        int i;
        int j;
        for(i=0;i<5;i++){
            for(j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
