package Frst2weeks;
import java.io.*;
public class Bufoutstr {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		FileOutputStream f = new FileOutputStream("d:/myfile1.txt");		//FileOutputStream Operation
		BufferedOutputStream b = new BufferedOutputStream(f);
		String str = "THIS IS FROM FILE INPUT STREAM";
		byte[] ar = str.getBytes();
		f.write(ar);
		f.close();
		b.close();
		
		FileInputStream fi = new FileInputStream("d:/myfile1.txt");		//FileInputStream Operation
		BufferedInputStream bi = new BufferedInputStream(fi);
		int i=0;
		while((i=bi.read())!=-1)
			System.out.print((char)i);
		fi.close();
		f.close();

		
	}

}
