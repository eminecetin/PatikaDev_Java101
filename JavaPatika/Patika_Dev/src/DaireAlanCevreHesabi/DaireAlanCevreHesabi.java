package DaireAlanCevreHesabi;
import java.util.Scanner;

public class DaireAlanCevreHesabi {

	public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      System.out.print("Dairenin yaricapini giriniz: ");
      double r=input.nextDouble();
      double pi=3.14;
      double alan= pi*r*r;
      double cevre=2*pi*r;
      System.out.println("Dairenin Alani: "+ alan);
      System.out.println("Dairenin Cevresi: "+cevre);
      
      System.out.print("Merkez Aci Olcusunu Giriniz: ");
      int alfa=input.nextInt();
      double dilimAlani=pi*(r*r)*alfa/360;
      System.out.print("Daire Diliminin Alani: "+dilimAlani);
      

      
      
		
	}

}
