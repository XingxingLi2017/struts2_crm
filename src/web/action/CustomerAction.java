package web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.config.entities.ActionConfig;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import domain.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
	
	private Customer customer = new Customer();
	
	public String find() {
		
		CustomerService service = new CustomerServiceImpl();
		List<Customer> list = service.find();
		System.out.println("list size = " + list.size());
		System.out.println(list);
//		ServletActionContext.getRequest().setAttribute("list", list);
		
		// store data in ValueStack
		ActionContext.getContext().getValueStack().set("list", list);
		
		return "success";
	}
	/*
	 * jump to customer-adding page
	 * */
	public String saveUI() {
		return "saveUI";
	}
	
	/*
	 * save customer information
	 * */
	public String save() {
		// get parameters
		// convert parameters into object
		CustomerService service = new CustomerServiceImpl();
		service.save(customer);
		// call service
		// page redirect
		return "saveSuccess";
	}
	@Override
	public Customer getModel() {
		return customer;
	}
}
