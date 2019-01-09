package com.mindtree.DAO;

import java.util.List;

import com.mindtree.entity.Customer;

public interface CustomerDao 
{
	String addCustomer(Customer customer);
	Customer getCustomerById(int accountNumer);
	List<Customer> getAllcustomer() throws Exception;
	String updateCustomerById(Customer updatedCustomer);
	String deleteCustomer(int accountNumberr);
	double calculatePercentage() throws Exception;
}
