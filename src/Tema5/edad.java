package Tema5;
import java.util.Scanner;
public class edad {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int edad;
		System.out.println("Dime tu edad");
		edad=t.nextInt();
		
		
		boolean mayoredad=edad(edad);
		
		if (mayoredad==true) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("No eres mayor de edad");
		}
		
	
	}
	public static boolean edad(int edad) {
		boolean resultado=false;
		if(edad>=18) {
			resultado=true;
		}
		return resultado;
	}
	
}