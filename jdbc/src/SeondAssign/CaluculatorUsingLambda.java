package SeondAssign;
interface Calculator
{
	int calc(int a,int b);
}
public class CaluculatorUsingLambda 
{
	public static void main(String[] args) 
	{
		Calculator c = (a,b) -> a*b;
		System.out.println(c.calc(10, 20));
	}
}