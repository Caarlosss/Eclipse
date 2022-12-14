package Tema5;
import java.util.Scanner;
public class num_N {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int num,suma,producto;
		System.out.println("Dime el límite menor");
		num=t.nextInt();
		
	}
	public static int producto(int n) {
		int producto=1;
		for (int i=1;i<=n;i++) {
			producto=producto*i;
		}
		return producto;
	}
	public static int suma(int n) {
		int suma=0;
		for(int i=1;i<=n;i++) {
			
				suma=suma+i;
			
		}
		return suma;
	}
	
	
}