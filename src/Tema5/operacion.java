package Tema5;
import java.util.Scanner;
public class operacion {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		double respuesta,num1,num2;
		int opcion;
			System.out.println("Dime un numero");
			num1=t.nextDouble();
			System.out.println("Dime otro numero");
			num2=t.nextDouble();
			System.out.println("Que quieres hacer \n"
					+ "1)Suma \n"
					+ "2)Resta \n"
					+ "3)Multiplicación \n"
					+ "4)División");
			opcion=t.nextInt();
			
			respuesta=operacion(num1,num2,opcion);
			
			System.out.println("El resultado es "+respuesta);
			
		
		
		
	
	}
	public static double operacion(double num1,double num2,int opcion) {
		double resultado=0;
		switch(opcion) {
		case 1:
			resultado=num1+num2;
			break;
		case 2:
			resultado=num1-num2;
			break;
		case 3:
			resultado=num1*num2;
			break;
		case 4:
			resultado=num1/num2;
			break;
		
		}
		return resultado;
	}
	
}