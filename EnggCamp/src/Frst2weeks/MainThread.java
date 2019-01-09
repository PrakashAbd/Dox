package Frst2weeks;
public class MainThread 
{
	public static void main(String[] args) 
	{
		Thread thread  = Thread.currentThread();
		System.out.println(thread);
		System.out.println("Name : "+thread.getName());
		thread.setName("Main Thread");
		System.out.println("Name : "+thread.getName());
		System.out.println("Priority : "+thread.getPriority());
		thread.setPriority(3);
		System.out.println("Priority : "+thread.getPriority());
		
		Thread1 a = new Thread1("Prakash",9214);
		System.out.println(a);
		a.start();
		a.run();
		
		
		RunnableThread r = new RunnableThread("M1049214","Prakash");
		Thread r1 = new Thread(r);
		r1.start();
		System.out.println(r);
		
		new Thread(() -> {															//Using Java 8 Features
				System.out.println("Hello");
				System.out.println(Thread.currentThread().getName());
				
			}).start();
		
	}
}