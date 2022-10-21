public class Rasyonel {

	private double pay;
	private double payda;

// Yapılandırıcı metodlar
	Rasyonel() {
		setPay(1);
		setPayda(1);
	}

	public Rasyonel(double a, double b) {
		pay = a;
		if (b != 0) {
			payda = b;
		} else {
			payda = 1;
			System.out.println("Payda 0 olamaz! 1 olarak değiştirildi.");
		}
	}

	public Rasyonel(double a) {
		pay = a;
		payda = 1;
	}

//get metodları
	public double getPay() {
		return pay;
	}

	public double getPayda() {
		return payda;
	}

//set metodları
	public void setPay(double a) {
		pay = a;

	}

	public void setPayda(double b) {
		payda = b;
		if (b != 0) {
			payda = b;
		} else {
			payda = 1;
			System.out.println("Payda 0 olamaz! 1 olarak değiştirildi.");
		}
	}

// ekleme metodu

	public void ekle(Rasyonel r) {
		setPay((r.payda * pay) + (r.pay * payda));
		setPayda(payda * r.payda);
	}

	public void carp(Rasyonel r) {
		setPay(pay * r.pay);
		setPayda(payda * r.payda);
	}

	public void bol(Rasyonel r) {
		setPay(pay * r.payda);
		setPayda(payda * r.pay);
	}

	public static Rasyonel topla(Rasyonel r1, Rasyonel r2) {
		Rasyonel sonuc = new Rasyonel();
		sonuc.setPay(r1.pay * r2.payda + r2.pay * r1.payda);
		sonuc.setPayda(r1.payda * r2.payda);
		return sonuc;
	}

	@Override
	public String toString() {
		return pay + "/" + payda;
	}

}
