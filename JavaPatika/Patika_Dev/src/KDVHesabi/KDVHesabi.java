package KDVHesabi;
import java.util.Scanner;
public class KDVHesabi {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.print("Para Degerini Giriniz: ");
		double para;
		
		para=input.nextDouble();
		
		
		
		
		double kdvOran= (para>=para  && para<1000) ? 0.18: 0.08;
		double KDVsiz=para;
		System.out.println("KDV'siz tutar: "+KDVsiz);
		double KDVli=(para+(para*kdvOran));
		System.out.println("KDV'li tutar: "+KDVli);
		double KDVTutari=para*kdvOran;
		System.out.println("KDV tutari: "+KDVTutari);
        
	}

}
