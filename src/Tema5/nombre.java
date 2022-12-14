package Tema5;
import java.util.Scanner;
public class nombre {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String nombre;
		System.out.println("Dime tu nombre");
		nombre=t.nextLine();
		
		saluda(nombre);
		
	
	}
	public static void saluda(String nom) {
		
		System.out.println("Hola "+nom );
	}
}