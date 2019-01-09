package com.mindtree.Assign1;
import java.util.Scanner;
import com.mindtree.ServiceImpl.CandidateServiceImpl;
import com.mindtree.ServiceImpl.ConstituencyServiceImpl;
import com.mindtree.entity.Candidates;
import com.mindtree.entity.Constituency;

public class App 
{
	public static void main( String[] args )
    {	
    	Scanner s = new Scanner(System.in);
    	int ch = 0;
    	do
    	{
    		System.out.println("1.Candidate 2.Constituency 3.Exit");
    		ch = s.nextInt();
    		switch(ch)
    		{
    			
    			case 1:	Candidates objc = new Candidates();
    					CandidateServiceImpl csi = new CandidateServiceImpl();
		    			System.out.println("1.Insert 2.DisplayById 3.DisplayByParty 4.DispalyAllCandidates 5.Exit");
		    			switch(s.nextInt())
		    			{
		    				case 1: System.out.println("Enter the Id");
		    						objc.setId(s.nextInt());
		    						System.out.println("Enter the Name");
		    						objc.setName(s.next());
		    						System.out.println("Enter the Constituency Id");
		    						objc.getConstituency().setId(s.nextInt());
		    						System.out.println("Enter the Party");
		    						objc.setParty(s.next());
		    						try 				 {		System.out.println(csi.insert(objc));		}
		    						catch (Exception e1) {		System.out.println(e1);						}
		    						break;
		    						
		    				case 2: System.out.println("Enter the Constituency Id");
		    						int cid = s.nextInt();
		    						csi.display().stream().filter(e -> e.getConstituency().getId()==cid).forEach(i -> System.out.println(i.getName()+" "+i.getParty()+" "+i.getConstituency().getName()));
		    						break;
		    				case 3: System.out.println("Enter the party name");
		    						String party = s.next();
		    						csi.display().stream().filter(e -> e.getParty().equals(party)).forEach((Candidates c) -> System.out.println(c.getName()+" "+c.getConstituency()));
		    						break;
		    				case 4: csi.display().stream().forEach((Candidates c) -> System.out.println(c.getName()+" "+c.getConstituency()));
    								break;
		    			}
		    			break;
		    			
    			case 2: Constituency con = new Constituency();
    					ConstituencyServiceImpl consi = new ConstituencyServiceImpl();
    					System.out.println("1.Insert 2.Display 3.Exit");
    					switch(s.nextInt())
    					{
    						case 1: System.out.println("Enter the Id");
    								con.setId(s.nextInt());
    								System.out.println("Enter the Name");
    								con.setName(s.next());
    								try {
    								System.out.println(consi.insert(con));
    								}
    								catch(Exception e)
    								{
    									System.out.println(e);
    								}
    								break;
    						case 2: consi.display().stream().forEach(e -> System.out.println(e.getId()+" "+e.getName()));
    								break;
    					}
    					break;
    			default: System.out.println("Exit");
    		}
    		
    	}while(ch<3);
    	s.close();
    }
}
