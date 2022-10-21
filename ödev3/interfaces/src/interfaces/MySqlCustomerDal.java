package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository{
	public void Add() {
		System.out.println("My SQL'e eklendi.");
	}
	
}
