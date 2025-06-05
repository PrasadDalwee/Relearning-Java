import java.util.Scanner;


public class InvertedNumberedTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for(int j=1; j<=rows; j++){
            for(int i=1; i<=rows-j+1; i++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }

        sc.close();
    }
}