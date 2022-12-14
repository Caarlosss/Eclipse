package Tema5;
import java.util.Scanner;
public class millas {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		double km,millas;
		System.out.println("Dime las millas");
		millas=t.nextDouble();
		
		km=transformaKM(millas);
		System.out.println(millas + "millas = "+km+"km");
		
		
	
	}
	public static double transformaKM(double millas) {
		double resultado;
		resultado=millas*1.60934;
		return resultado;
	}
	
}