package Tema5;
import java.util.Scanner;
public class impares_suma {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int num,suma;
		System.out.println("Dime un numero");
		num=t.nextInt();
		suma=sumaI(num);
		System.out.println(suma);
	}
	public static int sumaI(int n) {
		int suma=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				suma=suma+i;
			}
		}
		return suma;
	}
	
	
}