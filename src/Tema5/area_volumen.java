package Tema5;
import java.util.Scanner;
public class area_volumen {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		double area,volumen,radio,altura;
		int opcion;
		
			System.out.println("Dime el radio");
			radio=t.nextDouble();
			System.out.println("Dime la altura");
			altura=t.nextDouble();
			System.out.println("Que quieres saber \n"
					+ "1)Area \n"
					+ "2)Volumen");
			opcion=t.nextInt();
			
			switch (opcion) {
			case 1:
				area=area(radio,altura);
				System.out.println("El area es de "+area);
				break;
			case 2:
				volumen=volumen(radio,altura);
				System.out.println("El volumen es de "+volumen);
				break;
			}
			
			
			
		
		
		
	
	}
	public static double area(double r, double a) {
		double resultado,pi=3.14;
		resultado=2*pi*r*(r+a);
		return resultado;
	}
	public static double volumen(double r, double a) {
		double resultado,pi=3.14;
		resultado=pi*(r*r)*a;
		return resultado;
	}
	
}