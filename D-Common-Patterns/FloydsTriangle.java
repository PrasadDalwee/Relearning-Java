import java.util.Scanner;

public class FloydsTriangle {

    public static void main(String[] args) {
        int k = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int j = 0; j < rows; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print(++k + " ");
            }
            System.out.println("");
        }

        sc.close();
    }
}
