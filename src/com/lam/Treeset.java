package com.lam;

public class Treeset {

	public static void main(String[] args, Object Object) {
		// TODO Auto-generated method stub
          Treeset ts=new Treeset(Object o1,Object o2)->{
        	  
        	  String str=(String)o1;
        	  String str1=(String)o2;
        	  if(str.compareTo(str1)<0)
        	  {
        		  return 1;
        	  }
        	  else
        	  {
        		  return -1;
        	  }
        		  
        };
          ts.add("wuhan");
          ts.add("anu");
          ts.add("tara");
          ts.add("shali");
          System.out.println(ts);
          
	}

}
