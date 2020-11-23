package com.lam;



public class Mainlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Funcint f1=(str1,str2)->System.out.println(str1.length()+" "+str2.length());
		 f1.stringManipulation("java", "class");
		 f1=(str1,str2)->System.out.println(str1.concat(str2));
		 f1.stringManipulation("java", "class");
		 f1=(str1,str2)->System.out.println(str1.compareTo(str2));
		 f1.stringManipulation("java", "class");
	}

}
