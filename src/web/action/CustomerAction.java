package web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

public class CustomerAction extends ActionSupport {
	
	
	public String find() {
		
		CustomerService service = new CustomerServiceImpl();
		List<Customer> list = service.find();
		System.out.println(list);
		ServletActionContext.getRequest().setAttribute("list", list);
		return "success";
	}
}
