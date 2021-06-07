import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre: ");
        String Nombre = scan.nextLine();
        System.out.println("Hola " + Nombre);
        scan.close();
    }    
}
