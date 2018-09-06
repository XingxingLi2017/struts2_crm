package dao;

import java.util.List;

import domain.Customer;

public interface CustomerDao {

	List<Customer> find();

	void save(Customer customer);


}
