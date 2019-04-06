package com.nullity.customerManagment.model;
import java.util.*;

public class CustomerData 
{
	private LinkedList<Customer> customersData;
	
	public CustomerData()
	{
		customersData = new LinkedList<Customer>();
	}
	
	public CustomerData(LinkedList<Customer> _customersData)
	{
		customersData = _customersData;
	}
	
	public LinkedList<Customer> getAllCustomers()
	{
		return customersData;
		
	}
	
	public boolean addCustomer(Customer customerDetails)
	{
		if(getCustomerByID(customerDetails.getId()) == null)
			return customersData.add(customerDetails);
		else
			return false;
	}
	
	public Customer getCustomerByID(String _id)
	{
		try {
			for(Customer cust : customersData)
			{
				if(cust.getId().equals(_id))
					return cust;
			}
			return null;
		} catch (Exception e) {
			return null;
		}
	}
	
	public int updateCustomerAtIndex(int index,Customer customerDetails)
	{
		try {
			customersData.set(index, customerDetails);
			return 0;
		}
		catch(Exception e) {
			return -1;
		}
	}

	public boolean removeCustomer(String _id) {
		int index = 0;
		try {
			for(Customer cust : customersData)
			{
				if(cust.getId().equals(_id))
				{
					customersData.remove(index);
					return true;
				}
				index++;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean updateCustomer(String _id, Customer customerDetails) {
		
		if(!customerDetails.getId().equalsIgnoreCase(_id))
			return false;
		int index = 0;
		try {
			for(Customer cust : customersData)
			{
				if(cust.getId().equals(_id))
				{
					customersData.remove(index);
					customersData.add(index, customerDetails);
					return true;
				}
				index++;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
}
