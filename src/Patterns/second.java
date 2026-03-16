package Patterns;

public class second {
    public static void main(String[] args) {
        /*
        "*****
         ****
         ***
         **
         *
         */
        int i;
        int j;
        for(i=0;i<5;i++){
            for(j=i;j<5;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
