package Tema5;
import java.util.Scanner;
public class producto_limite {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int num1,num2,producto;
		System.out.println("Dime el límite menor");
		num1=t.nextInt();
		System.out.println("Dime el límite mayor");
		num2=t.nextInt();
		if(num1>num2) {
			int num3=num2;
			num2=num1;
			num1=num3;
		}
		producto=productoC(num1,num2);
		System.out.println(producto);
		
	}
	public static int productoC(int n1,int n2) {
		int producto=1;
		for (int i=n1;i<=n2;i++) {
			producto=producto*i;
		}
		return producto;
	}
	
	
}