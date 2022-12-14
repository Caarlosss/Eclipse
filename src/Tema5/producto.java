package Tema5;
import java.util.Scanner;
public class producto {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int n1,n2,producto;
		System.out.println("Dime el 1r numero");
		n1=t.nextInt();
		System.out.println("Dime el 2n numero");
		n2=t.nextInt();
		producto=multiplica(n1,n2);
		System.out.println("El producto de los numeros es "+producto);
		
	
	}
	public static int multiplica(int num1 ,int num2) {
		int resultado;
		resultado=num1*num2;
		return resultado;
	}
}