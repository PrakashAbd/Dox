package sample;
import java.util.Scanner;
class Employe
{
	float basicpar,dapay,hrpay,totalsalary;
	int id;
	String name;
	public Employe(){}
	public Employe(int id, String name,float basicpar, float dapay, float hrpay) {
		super();
		this.basicpar = basicpar;
		this.dapay = dapay;
		this.hrpay = hrpay;
		this.id = id;
		this.name = name;
	}
	float calculateSalary()
	{	return totalsalary;	}
}
//HR class Extends Baseclass Employe
class Hr extends Employe
{
	float gratuitypay;
	public Hr(){}
	
	public Hr(int id, String name, float basicpar, float dapay, float hrpay,float gratuitypay) 
	{
		super(id, name, basicpar, dapay, hrpay);
		this.gratuitypay = gratuitypay;
	}
	float calculateSalary()
	{	totalsalary = basicpar+dapay+hrpay+gratuitypay;	return totalsalary;		}
}
//Developer class Extends Baseclass Employe
class Developer extends Employe
{
	float incentivepay;
	public Developer() {	}
	
	public Developer(int id, String name, float basicpar, float dapay, float hrpay,float incentivepay)
	{
		super(id, name, basicpar, dapay, hrpay);
		this.incentivepay = incentivepay;
	}
	float calculateSalary()
	{	totalsalary = basicpar+dapay+hrpay+incentivepay;	return totalsalary;		}
}
//Main Class
public class oop 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Employe e[] = new Developer[2];
		Employe h[] = new Hr[2];
		Employe r[] = new Employe[4];
		int j= 0;
		for(int i=0;i<2;i++)
		{	e[i] = new Developer(s.nextInt(),s.next(),s.nextFloat(),s.nextFloat(),s.nextFloat(),s.nextFloat());		r[j++] = e[i];		}
		
		for(int i=0;i<2;i++)
		{	h[i] = new Hr(s.nextInt(),s.next(),s.nextFloat(),s.nextFloat(),s.nextFloat(),s.nextFloat());			r[j++] = h[i];		}
		
		System.out.println("ID    Name  TotalSalary");
		for(int i=0;i<4;i++)
			System.out.println(r[i].id+" \t"+r[i].name+"\t"+r[i].calculateSalary());
		
		s.close();
	}
}