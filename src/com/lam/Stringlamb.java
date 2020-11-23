package com.lam;

import java.util.Arrays;

public class Stringlamb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1[]={"sam","ram","jai","raj","bala"};
		Comparator c=(o1,o2)->{
			
			int a=((String)o1.length());
			int b=((String)o2.length());
			
			if(a<b)
			{
				return -1;
				
			}
			else
			{
				return 1;
			}
			
		};
		
		Arrays.sort(str1,c);
		Arrays.asList(str1).forEach(System.out::println);
      
		
		Arrays.sort(str1,(o1,o2)->{
			if(((String)o1).length()<((String)o1).length())
			{
				return 1;
			}
			else
			{
				return -1;
			}
			
		});
		Arrays.asList(str1).forEach(System.out::println);
		System.out.println();
		
		Arrays.sort(str1,(o1,o2)->{
			char ch=(char)o1.charAt(0);
			char ch1=(char)o1.charAt(0);
			
			if(ch<ch1)
			{
				return -1;
			}
			else
			{
				return1;
			}
		});
		
		Arrays.asList(str1).forEach(System.out::println);
		System.out.println();
		
		Arrays.sort(str1,(o1,o2)->{
			char ch=(char)o1.charAt(0);
			char ch1=(char)o1.charAt(0);
			
			if((ch=='E' || ch=='e')||(ch1=='E' || ch1=='e'))
			{
				return 1;
			}
			else
			{
				return -1;
			}
	});
		Arrays.asList(str1).forEach(System.out::println);
}
}
