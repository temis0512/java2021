import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primer número: ");
        int a = scan.nextInt();

        System.out.println("Segundo número: ");
        int b = scan.nextInt();

        int res = 0;

        for ( int i= 0; i < a; ++i){

            res += b;       

        }

        System.out.println(a + " x " + b + " = " + res);
        scan.close();
    }
}