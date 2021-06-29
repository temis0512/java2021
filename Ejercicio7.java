import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

System.out.print("Escribe algo: ");
String txt = scan.nextLine();
System.out.print("\n"+txt+"\n");
for (int i=0; i < txt.length(); i++){
if(i % 2 == 0){
String txt2 = Character.toString(txt.charAt(i));
System.out.print(txt2.toUpperCase());
}
else{
System.out.print(txt.charAt(i));
}
}
System.out.println("\n");
}
}
