package com.mindtree.DAO;
import java.sql.SQLException;
import java.util.List;
import com.mindtree.entity.Department;

public interface BankDao 
{
	String addBankDetails(Department bank);
	Department getBankDetailId(int bankCode);
	List<Department> getAllBankDetails() throws SQLException, ClassNotFoundException;
	String updateBank(Department updatedBank);
	String deleteBankById(int bankCode);
}