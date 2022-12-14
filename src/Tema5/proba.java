package Tema5;
import java.util.Scanner;
public class proba {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String nombre;
		int b,a,años;
		double areaT;
		System.out.println("Dime tu nombre");
		nombre=t.nextLine();
		
		saludar(nombre);
		
		System.out.println("Dime la base de un triangulo");
		b=t.nextInt();
		System.out.println("Dime la altura de un triangulo");
		a=t.nextInt();
		
		areaT=area(b,a);
		System.out.println("Area del triangulo: "+areaT);
		
		
		
		System.out.println("Dime tu edad");
		años=t.nextInt();
		
		boolean mayoredad=edad(años);
		
		if (mayoredad==true) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("No eres mayor de edad");
		}

	}
	public static void saludar(String nom) {
		
		System.out.println("Hola "+nom );
	}
	
	
	public static double area(int base,int altura) {
		double resultado;
		resultado=base*altura/2;
		return resultado;
		
	}
	
	public static boolean edad(int edad) {
		boolean resultado=false;
		if(edad>=18) {
			resultado=true;
		}
		return resultado;
	}
	
}
