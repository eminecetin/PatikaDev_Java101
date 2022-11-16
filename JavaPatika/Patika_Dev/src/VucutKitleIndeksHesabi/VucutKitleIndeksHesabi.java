package VucutKitleIndeksHesabi;
import java.util.Scanner;
public class VucutKitleIndeksHesabi {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		double boy,kilo;
		System.out.print("Lutfen boyunuzu metre cinsinden giriniz: ");
		boy=input.nextDouble();
		
		System.out.print("Lutfen kilonuzu giriniz: ");
		kilo=input.nextDouble();
		
		double vucutKitleIndeksi= kilo/(boy*boy);
		System.out.println("Vucut Kitle İndeksiniz: "+vucutKitleIndeksi);
	}

}
