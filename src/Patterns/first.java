package Patterns;

public class first {
    /*
      ****
      ****
      ****
      ****
     */
    public static void main(String[] args) {
        int i;
        int j;

        for(i=0;i<4;i++){
           //or if we use two loops
            for(j=0;j<4;j++){
                System.out.print("*"); //this loop prints * 4 times
            }
            System.out.println(); //inner loop goes to outer loop to check condition after 4 * r printed this line moves
            //row 0 -> row 1
        }
    }
}
