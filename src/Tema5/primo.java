package Tema5;
import java.util.Scanner;
public class primo {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int num;
		boolean primo;
		System.out.println("Dime un numero");
		num=t.nextInt();
		primo=primo(num);
		if(primo==true) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		
	}
	public static boolean primo(int n) {
		boolean resultado=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				resultado=false;
			}
		}
		return resultado;
	}
	
	
}