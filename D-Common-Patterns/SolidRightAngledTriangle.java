import java.util.Scanner;

public class SolidRightAngledTriangle {

    public static void main(String args[]){
        int length;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter edge-length of triangle:");
        length=scanner.nextInt();

        System.out.println("Result: SolidRightAngledTriangle["+length+"x"+length+"]");

        for(int j=0; j<length; j++){
            for(int i=0; i<=j; i++){
                System.out.print("*");
            }
            System.out.println("");
        }

        scanner.close();

    }
}