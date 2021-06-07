import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese número: ");
        int a = scan.nextInt();

        System.out.println("Ingresar potencia: ");
        int b = scan.nextInt();

        int res = a;

        for ( int i= 1; i < b; ++i){

            res = res * a;       

        }

        System.out.println(a + " ^ " + b + " = " + res);

        scan.close();
    }
}      
