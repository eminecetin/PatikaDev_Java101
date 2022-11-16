package ManavKasaProgrami;
import java.util.Scanner;
public class ManavKasaProgrami {

	public static void main(String[] args) {
      
		Scanner input =new Scanner(System.in);
		double armutFiyat,elmaFiyat,domatesFiyat,muzFiyat,patlicanFiyat;
		armutFiyat=2.14;
		elmaFiyat=3.67;
		domatesFiyat=1.11;
		muzFiyat=0.95;
		patlicanFiyat=5.00;
		
		System.out.print("Armut kac kilo ? :");
		double armutKilo=input.nextDouble();
		System.out.print("Elma kac kilo ? :");
		double elmaKilo=input.nextDouble();
		System.out.print("Domates kac kilo ? :");
		double domatestKilo=input.nextDouble();
		System.out.print("Muz kac kilo ? :");
		double muzKilo=input.nextDouble();
		System.out.print("Patlican kac kilo ? :");
		double patlicanKilo=input.nextDouble();
		
		double topTutar=(armutFiyat*armutKilo)+(elmaFiyat*elmaKilo)+(domatesFiyat*domatestKilo)+(muzKilo*muzFiyat)+(patlicanKilo*patlicanFiyat);
		
		System.out.print("Toplam Tutar: "+topTutar);
		
		
	}

}
