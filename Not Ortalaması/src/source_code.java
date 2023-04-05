import java.util.Scanner;

public class source_code {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int Fizik, Matematik, Türkçe, Tarih, Kimya, Müzik;
		System.out.print("Fizik Notunuz: ");
		Fizik = input.nextInt();
		System.out.print("Matematik Notunuz: ");
		Matematik = input.nextInt();
		System.out.print("Türkçe Notunuz: ");
		Türkçe = input.nextInt();
		System.out.print("Tarih Notunuz: ");
		Tarih = input.nextInt();
		System.out.print("Kimya Notunuz: ");
		Kimya = input.nextInt();
		System.out.print("Müzik Notunuz: ");
		Müzik = input.nextInt();
		
		
		
		double sonuc = (Fizik + Matematik + Türkçe + Tarih + Kimya + Müzik) / 6.0;
		
		if (sonuc >= 50) {
			  System.out.println("GEÇTİ " + sonuc);
			}
		
		else {
			System.out.println("KALDI " + sonuc);
		}	
				

	}

}
