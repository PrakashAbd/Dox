package Frst2weeks;

public class RunnableThread implements Runnable
{
	String mid;
	String name;
	public RunnableThread(String mid, String name) {
		super();
		this.mid = mid;
		this.name = name;
	}
	public String getMid() {
		return mid;
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
	@Override
	public void run() 
	{
		System.out.println("Runnable Thread Method");
	}
	@Override
	public String toString() {
		return "mid=" + mid + ", name=" + name;
	}
	
}
