package OrtalamaHesabi;

import java.util.Scanner;

public class OrtalamaHesabi {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);

		int Matematik,Fizik,Kimya,Turkce,Tarih,Muzik;
		
		
		   System.out.print("Matematik sinavinizi giriniz: ");
		   Matematik=input.nextInt();
		   System.out.print("Fizik sinavinizi giriniz: ");
		   Fizik=input.nextInt();
		   System.out.print("Kimya sinavinizi giriniz: ");
		   Kimya=input.nextInt();
		   System.out.print("Turkce sinavinizi giriniz: ");
		   Turkce=input.nextInt();
		   System.out.print("Tarih sinavinizi giriniz: ");
		   Tarih=input.nextInt();
		   System.out.print("Muzik sinavinizi giriniz: ");
		   Muzik=input.nextInt();

	            float ortalama=(Matematik+Fizik+Kimya+Turkce+Tarih+Muzik)/6;
             System.out.println(ortalama);
             
             
             
             String gecisDurum=(ortalama>=60) ? "Sinifi Gectiniz.." : "Sinifta Kaldiniz..";
             System.out.println(gecisDurum);
            
	}

}
