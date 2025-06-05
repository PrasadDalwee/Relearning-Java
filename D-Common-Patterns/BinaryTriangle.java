import java.util.Scanner;

public class BinaryTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int j = 0; j < rows; j++) {
            int k=j-1;
            for (int i = 0; i <= j; i++) {
                System.out.print((++k)%2 + " ");
            }
            System.out.println("");
        }

        sc.close();
    }

}
