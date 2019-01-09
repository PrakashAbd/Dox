package com.mindtree.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mindtree.DAO.BankDao;
import com.mindtree.entity.Department;
import com.mindtree.util.DbUtil;

public class BankDaoImpl implements BankDao 
{
	private Connection con  = null;
	private PreparedStatement ps = null;
	@Override
	public String addBankDetails(Department bank) 
	{	
		String msg = "";
		try 
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement("insert into bank values(?,?,?,?)");
			ps.setInt(1, bank.getBankCode());
			ps.setString(2, bank.getName());
			ps.setString(3, bank.getIfscCode());
			ps.setString(4, bank.getBranch());
			ps.executeUpdate();
			
			msg =  "Bank "+bank.getName()+" detail added successfully";
			con.close();
			ps.close();
		} 
		catch (ClassNotFoundException e)
		{		msg = "Sorry...Unable to add bank detail "+e;		}
		catch(SQLException e) 
		{		msg = "Unable to add bank detail"+ e;				}
		return msg;
	}
	
	@Override
	public Department getBankDetailId(int bankCode) 
	{
		Department bank = new Department();
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("select * from bank where bankCode="+bankCode);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				bank.setBankCode(rs.getInt(1));
				bank.setName(rs.getString(2));
				bank.setIfscCode(rs.getString(3));
				bank.setBranch(rs.getString(4));
				con.close();
				ps.close();
			}
		}
		catch (ClassNotFoundException e)
		{		System.out.println("Sorry...Unable to add bank detail "+e);		}
		catch(SQLException e) 
		{		System.out.println("Unable to add bank detail"+ e);				}
		return bank;
	}
	@Override
	
	
	public List<Department> getAllBankDetails() throws SQLException, ClassNotFoundException 
	{		
		List<Department> list = new ArrayList<Department>();
		con = DbUtil.getConnection();
		ps = con.prepareStatement("select * from bank");
		ResultSet rs = ps.executeQuery();
		Department obj = null;
		while(rs.next())
		{
			obj = new Department();
			obj.setBankCode(rs.getInt(1));
			obj.setName(rs.getString(2));
			obj.setIfscCode(rs.getString(3));
			obj.setBranch(rs.getString(4));
			list.add(obj);
		}
		con.close();
		ps.close();
		return list;		
	}
	@Override
	public String updateBank(Department updatedBank) 
	{		
		String msg = "";
			try 
			{
				con = DbUtil.getConnection();
				ps = con.prepareStatement("update bank set name = ?, ifscCode = ?,branch = ? where bankCode = ? ");
				ps.setString(1, updatedBank.getName());
				ps.setString(2, updatedBank.getIfscCode());
				ps.setString(3, updatedBank.getBranch());
				ps.setInt(4, updatedBank.getBankCode());
				ps.executeUpdate();
				msg = "Updated Succesfully";
				con.close();
				ps.close();
			}
			catch (ClassNotFoundException e) {
				msg = "Cannot be updated "+e;
			} catch (SQLException e) {
				msg = "Cannot be Updated "+e;
			}
		return msg;		
	}
	@Override
	public String deleteBankById(int bankCode) 
	{
		String msg = "";
		try 
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement("delete from bank where bankCode = "+bankCode);
			ps.executeUpdate();
			msg = "Deleted Successfully";
			con.close();
			ps.close();
		} 
		catch (ClassNotFoundException e) 
		{		msg = "Cannot be deleted "+e;			} 
		catch (SQLException e) 
		{		msg = "Cannot be Deleted "+e;			}
		
		return msg;
	}
}