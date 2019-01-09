package Frst2weeks;

import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//import java.util.Base64;

interface C
{
	int hello(int i);
}
public class LamdaExp 
{
	public static void main(String[] args) 
	{
//		Base64.Encoder encoder = Base64.getEncoder();
//		String str = "Hi this is a encoded string";
//		str = encoder.encodeToString(str.getBytes());
//		System.out.println("Encoded String "+str);
//		Base64.Decoder decoder = Base64.getDecoder();
//		System.out.println("Decoded String "+decoder.decode(str));
		C obj = num -> num+10;
		System.out.println(obj.hello(2));
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> l1 = new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(15);
		l.add(5);
		l.add(20);
		l.add(8);
		l.add(12);
		l.add(8);
		
		System.out.println("Todays Date "+LocalTime.now());
		System.out.println(LocalDate.now().isLeapYear() ? "Leap Year" : "Not Leap Year");
		System.out.println("Tomorrows Date "+LocalDate.now().plusDays(1));
		System.out.println("Yesterdays Date "+LocalDate.now().minusDays(1));
		System.out.println("Current time "+LocalTime.now());
		System.out.println("Before 10 hours "+ LocalTime.now().minusHours(10));
		System.out.println("After 70 minutes "+ LocalTime.now().plusMinutes(70));
		
		StringJoiner sj = new StringJoiner("/","[","]");
		sj.add("10");
		sj.add("10");
		sj.add("1996");
		System.out.println("Using String joiner = "+sj);
		
		Map<Integer,Long> m = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		m.forEach((key,value) -> System.out.println(key+" "+value));
		
		Stream<Integer> opstream = Stream.concat(l.stream(), l.stream().sorted());
		opstream.forEach(System.out::println);
		
		l.stream().sorted().forEach(e -> System.out.println(e));
		
		l.stream().sorted().limit(3).forEach(e -> System.out.println("Using Limit = "+e));
		
		System.out.println("Sum = "+l.stream().reduce(0, (e1,e2) -> e1+e2));
		
		System.out.println("Max = "+l.stream().max( (e1,e2) -> e1>e2 ? 1 : -1).get());
		
		System.out.println("Min = "+l.stream().min( (e1,e2) -> e1>e2 ? 1 : -1).get());
		
		l1 = l.stream().filter(e -> e>10).sorted().map(e -> e*e).collect(Collectors.toList());
		l1.stream().forEach(e -> System.out.print(e+" "));
		
		//Using threads
		Runnable r1 = new Runnable() {
			@Override
			public void run() {	System.out.println("Thread1 Running");			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		Runnable r2 = () -> System.out.println("Thread2 Running");
		t1 = new Thread(r2);
		t1.start();
	}
}