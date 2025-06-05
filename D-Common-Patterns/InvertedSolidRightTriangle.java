import java.util.Scanner;

public class InvertedSolidRightTriangle{
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter edge-length of inverted solid-right-angled-triangle:");
        int l=scanner.nextInt();

        System.out.println("Result: InvertedSolidRightTriangle["+l+"x"+l+"]");

        for(int j=0; j<l; j++){
            for(int i=0; i<l-j; i++){
                System.out.print("*");
            }
            System.out.println("");
        }

        scanner.close();
    }
}