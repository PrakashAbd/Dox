package Frst2weeks;


@FunctionalInterface
interface Func 
{ 
    int calculate(int x); 
} 
  
class Test 
{ 
    public static void main(String args[]) 
    { 
        int a = 5;  
        Func s = (int x) -> x*x;  
        
        System.out.println(s.calculate(a));
        
        Func c = (int x) -> x*x*x;
        
        System.out.println(c.calculate(a)); 
    } 
} 