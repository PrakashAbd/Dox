package Frst2weeks;
public class Professor extends Person
{
	int booksPublished;

	public Professor() {	booksPublished = 0;			}

	public Professor(String name,int booksPublished) 
	{
		super(name);
		this.booksPublished = booksPublished;
	}
	void print()
	{
		System.out.println("Name : "+this.name+"\tNumber Of Books Published : "+this.booksPublished);
	}
	boolean isOutstanding()
	{
		return (this.booksPublished>4)? true : false;
	}	
}