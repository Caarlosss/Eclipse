package Tema5;
import java.util.Scanner;
public class iva {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		double preu,preuIVA;
		for(int i=1;i<=5;i++) {
			System.out.println("Dime un precio");
			preu=t.nextDouble();
			preuIVA=IVA(preu);
			System.out.println("El precio total es " + preuIVA);
		}
		
	
	}
	public static double IVA(double precio) {
		double resultado,iva;
		iva=(precio*21)/100;
		resultado=precio+iva;
		return resultado;
	}
	
}