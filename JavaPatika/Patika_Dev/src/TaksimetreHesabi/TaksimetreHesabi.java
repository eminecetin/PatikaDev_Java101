package TaksimetreHesabi;
import java.util.Scanner;

public class TaksimetreHesabi {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		double gidilenMesafe;
		System.out.print("Gidilen km mesafeyi giriniz: ");
		gidilenMesafe=input.nextDouble();
		
		double kmUcret=2.20;
		int acilisUcreti=10;
		int miniTutar=20;
		double topUcret=(gidilenMesafe*kmUcret)+acilisUcreti;
		System.out.print("Taksimetre Ucreti:  ");
		System.out.print(topUcret>10 && topUcret<20 ? miniTutar:topUcret); 
				
	}

}
