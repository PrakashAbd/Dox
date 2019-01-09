package Frst;
import java.util.Scanner;
public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        while(q-- >0)
        {
            String s1 = s.next();
            String s2 = s.next();
            int c1[] = new int[26];
            int c2[] = new int[26];
            int ans = 0;
            for(int i=0;i<s1.length();i++)
                c1[s1.charAt(i)-'a']++; 
            for(int i=0;i<s2.length();i++)
                c2[s2.charAt(i)-'a']++;
            
            for(int i=0;i<26;i++)
                ans += Math.abs(c1[i]-c2[i]);
        
            System.out.println(ans);
            s.close();
        }
	}

}
