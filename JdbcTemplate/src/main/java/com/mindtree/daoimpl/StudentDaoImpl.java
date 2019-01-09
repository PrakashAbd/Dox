package com.mindtree.daoimpl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.mindtree.dao.StudentDao;
import com.mindtree.entity.Student;

public class StudentDaoImpl implements StudentDao
{
	JdbcTemplate template;
	public StudentDaoImpl() {
		super();
	}
	
	public StudentDaoImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public String addStudent(Student s) 
	{
		String sql = "insert into Student values(?,?,?)";
		template.update(sql,s.getRollNum(),s.getName(),s.getPercentage());
		return "Insert Successfully";
	}

	public String deleteStudent(int rollNum) 
	{
		template.update("delete from Student where rollNum = "+rollNum);
		return "Deleted Successfully";
	}

	public List<Student> displayById(int rollNum) 
	{
		return template.query("Select * from student where rollNum = "+rollNum, new RowMapper<Student>() 
		{
			public Student mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Student e=new Student();  
		        e.setRollNum(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        e.setPercentage(rs.getInt(3));  
		        return e;  
		    }
		});
	}
	
	public List<Student> displayAll() 
	{
		return template.query("select * from Student",new ResultSetExtractor<List<Student>>(){  
		    public List<Student> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<Student> list=new ArrayList<Student>();  
		        while(rs.next()){  
		        Student e=new Student();  
		        e.setRollNum(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        e.setPercentage(rs.getDouble(3));  
		        list.add(e);  
		        }  
		        return list; 
		    }  
	    });  
	 } 

}