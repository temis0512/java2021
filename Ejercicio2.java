import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        int a= scan.nextInt();
        System.out.println("Ingrese el numero b: ");
        int b = scan.nextInt();        
        System.out.println("Resultados");
        int sum = a+b;
        int res = a-b;
        int mult = a*b; 
        int div = a/b;
        int mod = a%b;
        System.out.println( a + "+" + b + "=" + sum);
        System.out.println( a + "-" + b + "=" + res);
        System.out.println( a + "*" + b + "=" + mult);
        System.out.println( a + "/" + b + "=" + div);
        System.out.println( a + "%" + b + "=" + mod);
        scan.close();
    }
}
