import java.util.Scanner;

public class Inverted2SolidRightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the edge-length of the triangle:");
        int edge= scanner.nextInt();

        for(int j=0; j<edge; j++) {
            int i=edge - j;

            System.out.print(" ".repeat(j));
            System.out.print("*".repeat(i));
            System.out.println("");
        }

        scanner.close();
    }
}
