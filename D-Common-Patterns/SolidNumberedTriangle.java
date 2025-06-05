import java.util.Scanner;

public class SolidNumberedTriangle {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the edge-length of the triangle:");
        int edgeLength = scanner.nextInt();

        for(int j=1; j<=edgeLength; j++) {
            for(int i=1; i<=j; i++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        
        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
