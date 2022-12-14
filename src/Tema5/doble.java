package Tema5;
import java.util.Scanner;
public class doble {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int n,numD;
		System.out.println("Dime un numero");
		n=t.nextInt();
		numD=doble(n);
		System.out.println("El doble es "+ numD);
		
		
	
	}
	public static int doble(int num) {
		int doble;
		doble=num*2;
		return doble;
	}
}