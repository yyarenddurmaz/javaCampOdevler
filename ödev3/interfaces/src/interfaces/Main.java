package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customermanager=new CustomerManager(new MySqlCustomerDal());
		
		customermanager.add();
				
	}

}
