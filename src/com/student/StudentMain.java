package com.student;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many details");
		int n=sc.nextInt();
		ArrayList <Student> al=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter name of student");
			String sname=sc.nextLine();
			System.out.println("enter maths mark of student");
			int matmark=sc.nextInt();
			System.out.println("enter science mark of student");
			int scimark=sc.nextInt();
			System.out.println("enter social mark of student");
			int socmark=sc.nextInt();
			int total=matmark+scimark+socmark;
			double perc=(total/300)*100;
			
			Student s=new Student(sname,matmark,scimark,socmark,total,perc);
			al.add(s);
		}
		ArrayList al1=(ArrayList)al.stream().filter(m->m.matmark<50).collect(Collectors.toList());
		ArrayList al2=(ArrayList)al.stream().filter(s->s.scimark<50).collect(Collectors.toList());
		ArrayList al3=(ArrayList)al.stream().filter(s->s.socmark<50).collect(Collectors.toList());
	}

}
