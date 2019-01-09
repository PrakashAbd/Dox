package multithreadingAssign;

public class ProducerConsumerMain 
{
	public static void main(String args[]) throws InterruptedException
	{
		ProducerConsumer p = new ProducerConsumer();
		Thread t1 = new Thread(new Runnable()
				{
					public void run()
					{
						p.producer();
					}
				});
		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				p.consumer();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
}
