package com.nullity.customerManagment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nullity.customerManagment.controller.CustomerController;
import com.nullity.customerManagment.model.Customer;
import com.nullity.customerManagment.model.CustomerData;


public class CustomerControllerTest 
{
	private final String id = "851005993";
	private final String wid = "851005996";
	private final Customer cust = new Customer(id, "CPR", "Ali Saleh Khalaf", "Bahraini"
			, 33, "17/10/1985", "Res", "20000000000001");
	private final Customer custN = new Customer(id, "CPR", "Ali Saleh Khalaf", "Bahraini"
			, 32, "17/10/1986", "Res", "10000000000001");
	private final CustomerController controller = new CustomerController();
	private final CustomerData data = new CustomerData();
	
	@Test
	public void getAll() 
	{
		
		assertEquals(data.getAllCustomers(),controller.getAll());
    }
	
	@Test
    public void createCustomer() {
		assertEquals(true,controller.createCustomer(cust));
    }
	
	@Test
    public void createDuplicateCustomer() {
		controller.createCustomer(cust);
		assertEquals(false,controller.createCustomer(cust));
    }
	
	@Test
	public void getByID() {
		controller.createCustomer(cust);
		assertEquals(cust,controller.getByID(id));
    }
	
	@Test
	public void getByWrongID() {
		assertEquals(null,controller.getByID(wid));
    }
	
	@Test
    public void updateCustomerByWrongID() {
		assertEquals(false,controller.updateCustomer(wid, custN));
    }
	
	@Test
    public void updateCustomer() {
		controller.createCustomer(cust);
		assertEquals(true,controller.updateCustomer(id, custN));
    }
	@Test
	public void getUpdatedCustomer() {
		controller.createCustomer(cust);
		controller.updateCustomer(id, custN);
		assertEquals(custN,controller.getByID(id));
    }
	
	@Test
    public void removeCustomerByWrongID() {
		assertEquals(false,controller.removeCustomer(wid));
    }
	
	@Test
    public void removeCustomerByID() {
		controller.createCustomer(cust);
		assertEquals(true,controller.removeCustomer(id));
    }
}
