import java.util.Scanner;

public class HollowRectangleOptimised {

    /*
     * I noticed in the tutorial a simpler and more optimised code. While my code is
     * modular, this approach saves time
     * as it is able to boil down the logic to simplest component.
     * 
     * Relearning1: Dry run, try to find a simpler pattern if it exists, then
     * identify edge cases sometimes the solution
     * that spontaneously pops up in mind is correct but it has the risk of
     * unnecessary complexity.
     */
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int length, breadth;

        System.out.print("Enter length:");
        length = scanner.nextInt();
        System.out.print("Enter breadth:");
        breadth = scanner.nextInt();

        System.out.println("Result: HollowRectangle[" + length + "x" + breadth + "]");

        for(int i=0; i<breadth; i++){
            for(int j=0; j<length; j++){
                if(i==0 || j==0 || i==breadth-1 || j==length-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        scanner.close();
    }

}
