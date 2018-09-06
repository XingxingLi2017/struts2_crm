package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.CustomerDao;
import domain.Customer;
import utils.HibernateUtils;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public List<Customer> find() {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		List<Customer> list = session.createQuery("from Customer").list();
		
		tx.commit();
		return list;
	}

	@Override
	public void save(Customer customer) {
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(customer);
		
		transaction.commit();
	}

}
