package com.lam;

import java.util.Arrays;

public class Arraylam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object o[]={12,45,85,39,15,63};
		Comparator c=(o1,o2)->{
			
			Integer a=(Integer)o1;
			Integer b=(Integer)o2;
			
			if(a>b)
			{
				return -1;
			}
			else
			{
				return 1;	
			}
		};
		Arrays.sort(o,c);
		System.out.println(Arrays.asList(o));
	}

}
