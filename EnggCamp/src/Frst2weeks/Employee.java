package Frst2weeks;

public class Employee 
{
	String mid;
	String name;
	int salary;
	public Employee() {}
	public Employee(String mid, String name, int salary) {
		super();
		this.mid = mid;
		this.name = name;
		this.salary = salary;
	}
	public String getMid() {
		return mid;
	}
	@Override
	public String toString() {
		return "Employee [mid=" + mid + ", name=" + name + ", salary=" + salary + "]";
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}