package com.foreach;

import java.util.ArrayList;

public class Foreachmethodex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList al=new ArrayList();
          al.add(45);
          al.add(78);
          al.add(48);
          al.add(69);
          al.forEach((c)->System.out.println(c));
          
	}

}
