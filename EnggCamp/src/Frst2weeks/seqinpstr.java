package Frst2weeks;
import java.io.*;
public class seqinpstr {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		// TODO Auto-generated method stub
		FileInputStream f1 = new FileInputStream("d:/myfile.txt");
		FileInputStream f2 = new FileInputStream("d:/myfile1.txt");
		FileOutputStream f3 = new FileOutputStream("d:/myfile2.txt");
		SequenceInputStream s = new SequenceInputStream(f1,f2);
		int i=0;
		while((i=s.read())!=-1)
		{
			System.out.print((char)i);
		}
		f1.close();
		f2.close();
		f3.close();
		s.close();
	}
}