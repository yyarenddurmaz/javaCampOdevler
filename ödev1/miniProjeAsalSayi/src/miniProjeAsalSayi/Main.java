package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = -8;
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;

		if(number==1) {
			System.out.println("Sayı Asal Değildir.");
			return;
		}
		if (number<0) {
			System.out.println("Geçersiz sayı. Lütfen sıfırdan büyük bir sayı giriniz.");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı.");
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayı Asaldır.");
		} else {
			System.out.println("Sayı Asal Değildir.");}

	}

}
