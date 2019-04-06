package com.nullity.customerManagment.controller;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nullity.customerManagment.model.Customer;
import com.nullity.customerManagment.model.CustomerData;

@RestController
@RequestMapping(value = "api/customers")
public class CustomerController {
	
	private final CustomerData data = new CustomerData();

	@RequestMapping(method = RequestMethod.GET)
    public LinkedList<Customer> getAll() {    	
        return data.getAllCustomers();
    }
	
	@RequestMapping(path = "{id}", method = RequestMethod.GET)
	public Customer getByID(@PathVariable("id") String id) {

        return data.getCustomerByID(id);
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public boolean createCustomer(@RequestBody Customer customerDetails) {
        return data.addCustomer(customerDetails);
    }
	
	@RequestMapping(path = "{id}",method = RequestMethod.DELETE)
    public boolean removeCustomer(@PathVariable("id") String id) {
        return data.removeCustomer(id);
    }
	
	@RequestMapping(path = "{id}",method = RequestMethod.PUT)
    public boolean updateCustomer(@PathVariable("id") String id,@RequestBody Customer customerDetails) {
        return data.updateCustomer(id,customerDetails);
    }
}
