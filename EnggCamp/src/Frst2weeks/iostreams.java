package Frst2weeks;
import java.io.*;
public class iostreams 
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			File f = new File("d:/myfile.txt");
			BufferedReader bf = new BufferedReader(new FileReader(f));	//BufferedReader Stream
			FileWriter fw = new FileWriter(f);
			fw.write("HI THIS IS A SAMPLE CODE");
			fw.close();
			String str;
			while((str=bf.readLine())!=null)
				System.out.println(str);
		
			bf.close();
		}
		catch(Exception e)
		{	System.out.println(e);	}
	}
}