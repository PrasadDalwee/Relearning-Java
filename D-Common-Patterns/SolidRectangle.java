import java.util.Scanner;

public class SolidRectangle {

    public static void main(String args[]){
        int length, breadth;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter length:");
        length=scanner.nextInt();
        System.out.print("Enter breadth");
        breadth=scanner.nextInt();

        System.out.println("Solid rectangle: ["+length+"x"+breadth+"]");

        for(int i=0; i<breadth; i++){
            for(int j=0; j<length; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        scanner.close();
    }
    
}