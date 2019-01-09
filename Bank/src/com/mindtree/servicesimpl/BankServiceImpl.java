package com.mindtree.servicesimpl;
import java.sql.SQLException;
import java.util.List;
import com.mindtree.DAO.impl.BankDaoImpl;
import com.mindtree.entity.Department;
import com.mindtree.exceptions.*;

public class BankServiceImpl
{
	BankDaoImpl b = new BankDaoImpl();
	Department bn = new Department();
	public String addBankDetails(Department bank) throws MyException 
	{
		bn = b.getBankDetailId(bank.getBankCode());
		if(bn.getBankCode()!=0)
			throw new BankExceptions();
		
		return b.addBankDetails(bank);
	}
	public Department getBankDetailId(int bankCode) throws Exception 
	{	
		return b.getBankDetailId(bankCode);
	}
	public List<Department> getAllBankDetails() throws SQLException, ClassNotFoundException 
	{
		List<Department> list =  b.getAllBankDetails();
		return list;
	}
	public String updateBank(Department updatedBank) throws MyException 
	{
		bn = b.getBankDetailId(updatedBank.getBankCode());
		if(bn.getBankCode()==0)
			throw new BankCodeException();
		
		return b.updateBank(updatedBank);		
	}

	public String deleteBankById(int bankCode) throws MyException 
	{
		if(b.getBankDetailId(bankCode)!=null)
			throw new BankCodeException();
		
		return b.deleteBankById(bankCode);
	}	
}