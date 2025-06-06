import java.util.*;

public class Butterfly {

    public static void main(String [] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the wing-width:");
        int n=sc.nextInt();

        //forward
        for(int k=1; k<=n; k++){
            printStarLine(k, (n-k)*2);
        }

        //backward
        for(int k=n; k>=1; k--){
            printStarLine(k, (n-k)*2);
        }


        sc.close();

    }

    private static void printStarLine(int star, int blank){
        for(int i=0; i<star; i++){
            System.out.print("*");
        }

        for(int i=0; i<blank; i++){
            System.out.print(" ");
        }

        for(int i=0; i<star; i++){
            System.out.print("*");
        }

        System.out.println();
    }
}
