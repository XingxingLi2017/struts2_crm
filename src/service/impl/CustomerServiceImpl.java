package service.impl;

import java.util.List;

import dao.CustomerDao;
import dao.impl.CustomerDaoImpl;
import domain.Customer;
import service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public List<Customer> find() {
		CustomerDao dao = new CustomerDaoImpl();
		return dao.find();
	}


}
