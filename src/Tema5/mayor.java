package Tema5;
import java.util.Scanner;
public class mayor {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int n1,n2,numM;
		System.out.println("Dime el 1r numero");
		n1=t.nextInt();
		System.out.println("Dime el 2n numero");
		n2=t.nextInt();
		numM=mayor(n1,n2);
		System.out.println("El numero mayor es "+numM);
		
	
	}
	public static int mayor(int num1 ,int num2) {
		int resultado=num1;
		if(num1>num2) {
			resultado=num1;
		}else {
			resultado=num2;
		}
		return resultado;
	}
}