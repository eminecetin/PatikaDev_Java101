package UcgenAlanHesabi;
import java.util.Scanner;
public class AlanHesabi {

	public static void main(String[] args) {
      
		Scanner input =new Scanner(System.in);
		
		int a,b;
		double c;
		System.out.print("1. kenari giriniz: ");
		a=input.nextInt();

		System.out.print("b sayisini giriniz: ");
		b=input.nextInt();

		
		c=Math.sqrt((a*a)+(b*b));
		System.out.println("Hipotenus uzunlugu: "+c);
		
		double u=(a+b+c)/2;
		double cevre=2*u;
		System.out.println("Ucgenin Cevresi: "+cevre);
		
		double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Ucgenin Alani: "+alan);
		
		
	}

}

