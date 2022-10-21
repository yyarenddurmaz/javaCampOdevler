public class RasyonelTest {

	public static void main(String[] args) {

		Rasyonel r1 = new Rasyonel(27, 15);
		Rasyonel r2 = new Rasyonel(12, 15);
		Rasyonel r3 = new Rasyonel(4);
		Rasyonel r4 = new Rasyonel(2, 0);
		Rasyonel r5 = new Rasyonel();
		// r.pay=3;
		// r.payda=0;

		/*
		 * System.out.println("R2 rasyonel sayısı: "); System.out.println("Pay: " +
		 * r2.getPay()); System.out.println("Payda: " + r2.getPayda());
		 * 
		 * r2.setPay(12); r2.setPayda(0);
		 * 
		 * System.out.println("----------"); System.out.println("R2 rasyonel sayısı: ");
		 * System.out.println("Pay: " + r2.getPay()); System.out.println("Payda: " +
		 * r2.getPayda());
		 * 
		 * r3.carp(r2);
		 * 
		 * System.out.println("----------"); System.out.println("R3 rasyonel sayısı: ");
		 * System.out.println("Pay: " + r1.getPay()); System.out.println("Payda: " +
		 * r1.getPayda());
		 */

		/*
		 * System.out.println(r5.getPayda());
		 * 
		 * r5 = r1; r1.setPayda(4545); S System.out.println(r5.getPayda());
		 */

		r5 = Rasyonel.topla(r1, r2);
		System.out.println("----------");
		System.out.println("R5 rasyonel sayısı: ");
		System.out.println("Pay: " + r5.getPay());
		System.out.println("Payda: " + r5.getPayda());

		System.out.println(r5.toString());
	}

}
