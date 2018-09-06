package service;

import java.util.List;

import domain.Customer;

public interface CustomerService {
	
	public List<Customer> find();

	public void save(Customer customer);
}
