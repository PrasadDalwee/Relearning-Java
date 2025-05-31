import java.util.Scanner;

public class HollowRectangle {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int length, breadth;

        System.out.print("Enter length:");
        length=scanner.nextInt();
        System.out.print("Enter breadth:");
        breadth=scanner.nextInt();

        System.out.println("Result: HollowRectangle["+length+"x"+breadth+"]");

        if(length<=0 || breadth<=0){
            return;
        }

        for(int i=0; i<breadth; i++){
            if(i==0 || i==breadth-1){
                printSolidLine(length);
            }else{
                printHollowLine(length);
            }
        }

        scanner.close();
    }

    private static void printSolidLine(int x) {
        for (int i = 0; i < x; i++) {
            printStar();
        }
        System.out.println("");
    }

    private static void printHollowLine(int x) {
        if (x == 0) {
            return;
        }
        if (x == 1) {
            printStar();

            System.out.println("");
            return;
        }

        printStar();

        for (int i = 1; i < x - 1; i++) {
            System.out.print(" ");
        }

        printStar();
        System.out.println("");

    }

    private static void printStar() {
        System.out.print("*");
    }
}
