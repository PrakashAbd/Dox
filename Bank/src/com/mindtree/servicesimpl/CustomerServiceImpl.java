package com.mindtree.servicesimpl;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import com.mindtree.DAO.impl.CustomerDaoImpl;
import com.mindtree.entity.Customer;
import com.mindtree.exceptions.BankCodeException;
import com.mindtree.exceptions.CustomerException;
import com.mindtree.exceptions.InvalidAgeException;

public class CustomerServiceImpl 
{
	CustomerDaoImpl csi = new CustomerDaoImpl();
	BankServiceImpl bc = new BankServiceImpl();
	
	public boolean checkAccountNumber(long accnum) throws Exception
	{
		List<Customer> list = getAllcustomer();
		for(Customer c : list )
		{
			if(c.getAccountNumber()==accnum)
				return false;
		}
		return true;
	}
	
	public String addCustomer(Customer customer) throws Exception 
	{
		if(checkAccountNumber(customer.getAccountNumber()))
		{
			if((bc.getBankDetailId(customer.getBank().getBankCode())).getBankCode() == 0)
				throw new BankCodeException();
		
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		    LocalDate date = LocalDate.parse(customer.getDateOfBirth(), formatter);
		    date.format(formatter);
			Period p = Period.between(date,LocalDate.now());
			if(p.getYears()<18)
				throw new InvalidAgeException();			
		}
		else throw new Exception("Account Number already exists");
		
		return csi.addCustomer(customer);
	}

	public Customer getCustomerById(int accountNumer) throws Exception 
	{
		if(checkAccountNumber(accountNumer)==false)
			return csi.getCustomerById(accountNumer);
		else throw new CustomerException();
	}
	
	public List<Customer> getAllcustomer() throws Exception 
	{
		List<Customer> list = csi.getAllcustomer();
		return list;
	}
	public String updateCustomerById(Customer updatedCustomer) throws Exception 
	{
		if(checkAccountNumber(updatedCustomer.getAccountNumber())==false)
			return csi.updateCustomerById(updatedCustomer);	
		else throw new CustomerException();
	}
	public String deleteCustomer(int accountNumberr) throws Exception 
	{
		if(checkAccountNumber(accountNumberr)== false)
			return csi.deleteCustomer(accountNumberr);
		else throw new CustomerException();
	}
	public double calculatePercentage() throws Exception
	{
		return csi.calculatePercentage();
	}
}