package com.mindtree.DAO.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mindtree.DAO.CustomerDao;
import com.mindtree.entity.Department;
import com.mindtree.entity.Customer;
import com.mindtree.servicesimpl.BankServiceImpl;
import com.mindtree.util.DbUtil;

public class CustomerDaoImpl  implements CustomerDao
{
	Connection con = null;
	PreparedStatement ps = null;
	public String addCustomer(Customer customer) 
	{
		String msg = "";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("insert into Customer(accountNumber,name,gender,location,panId,dateOfBirth,createdOn,phoneNumber,bankCode) values(?,?,?,?,?,?,?,?,?)");
			ps.setLong(1, customer.getAccountNumber());
			ps.setString(2, customer.getName());
			ps.setString(3, customer.getGender());
			ps.setString(4, customer.getLocation());
			ps.setString(5, customer.getPanId());
			ps.setString(6, customer.getDateOfBirth());
			ps.setString(7, customer.getCreatedOn());
			ps.setLong(8, customer.getPhoneNumber());
			ps.setInt(9, customer.getBank().getBankCode());
			ps.executeUpdate();
			msg =  "Customer "+customer.getName()+" detail added successfully";
			con.close();
			ps.close();
		}
		catch (ClassNotFoundException e) {		msg = "Cannot be added "+e;		} 
		catch (SQLException e) 		 	 {		msg = "Cannot be added "+e;		}
		return msg;
	}

	@Override
	public Customer getCustomerById(int accountNumer) 
	{
		Customer c = new Customer();
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("select * from Customer where accountNumber="+accountNumer);
			BankDaoImpl bimpl = new BankDaoImpl();
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				c.setAccountNumber(rs.getLong(2));
				c.setName(rs.getString(3));
				c.setGender(rs.getString(4));
				c.setLocation(rs.getString(5));
				c.setPanId(rs.getString(6));
				c.setDateOfBirth(rs.getString(7));
				c.setCreatedOn(rs.getString(8));
				c.setPhoneNumber(rs.getLong(9));
				Department o  = bimpl.getBankDetailId(rs.getInt(1));
				c.setBank(o);
				con.close();
				ps.close();
			}
		} 
		catch (ClassNotFoundException e) 
		{	
			System.out.println("Cannot be added "+e);
		}
		catch (SQLException e) 
		{
			System.out.println("Cannot be added "+e);
		}
		return c;
	}

	@Override
	public List<Customer> getAllcustomer() throws Exception 
	{
		List<Customer> list = new ArrayList<Customer>();
		BankServiceImpl bsim = new BankServiceImpl();
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("select * from customer");
			ResultSet rs = ps.executeQuery();
			Customer cusobj = null;
			while(rs.next())
				try {
					{
						cusobj = new Customer();
						cusobj.setAccountNumber(rs.getInt(2));
						cusobj.setName(rs.getString(3));
						cusobj.setGender(rs.getString(4));
						cusobj.setLocation(rs.getString(5));
						cusobj.setPanId(rs.getString(6));
						cusobj.setDateOfBirth(rs.getString(7));
						cusobj.setCreatedOn(rs.getString(8));
						cusobj.setPhoneNumber(rs.getLong(9));
						Department b1 = bsim.getBankDetailId(rs.getInt(1)); 
						cusobj.setBank(b1);
						list.add(cusobj);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			con.close();
			ps.close();
		} 
		catch (ClassNotFoundException e) {		System.out.println(e);	}
		catch (SQLException e) 			 {		System.out.println(e);	}
		
		return list;	
	}
	@Override
	public String updateCustomerById(Customer updatedCustomer) 
	{
		String msg = "";
		try 
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement("update Customer set name = ?, gender = ?,location = ?,panId = ?,dateOfBirth = ?,createdOn = ?,phoneNumber = ? where accountNumber = ? and bankCode = ?");
			ps.setString(1, updatedCustomer.getName());
			ps.setString(2, updatedCustomer.getGender());
			ps.setString(3, updatedCustomer.getLocation());
			ps.setString(4, updatedCustomer.getPanId());
			ps.setString(5, updatedCustomer.getDateOfBirth());
			ps.setString(6, updatedCustomer.getCreatedOn());
			ps.setLong(7, updatedCustomer.getPhoneNumber());
			ps.setLong(8, updatedCustomer.getAccountNumber());
			Department ob = updatedCustomer.getBank();
			ps.setInt(9, ob.getBankCode());
			msg = (ps.executeUpdate()>0) ? "Updated Succesfully" : "AccountNumber not found in that bank... Cannot be Updated";
			con.close();
			ps.close();
		}
		catch (ClassNotFoundException e) {			msg = "Cannot be updated "+e;	}
		catch (SQLException e) 			 {			msg = "Cannot be Updated "+e;	}
		return msg;	
	}

	@Override
	public String deleteCustomer(int accountNumberr) 
	{
		String msg = "";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("delete from Customer where accountNumber = "+accountNumberr);
			ps.executeUpdate();
			msg = "Deleted Successfully";
			con.close();
			ps.close();
		}
		catch (ClassNotFoundException e) 	{		msg = "Cannot be deleted "+e;			}
		catch (SQLException e) 				{		msg = "Cannot be Deleted "+e;		}
		return msg;
	}
	@Override
	public double calculatePercentage() throws Exception 
	{
		List<Customer> ls = getAllcustomer();
		int count = (int) ls.stream().filter((Customer e) -> e.getGender().equals("Male")).count(); 
		double ans = count*100;
		return ans/ls.size();
	}
}