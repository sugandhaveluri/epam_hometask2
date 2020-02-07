package com.chocolates;
import java.util.*;

import com.sweets.sweets;

public class chocolates  extends sweets{
	Scanner sc=new Scanner(System.in);
	public static int c=0;
	public void choco1()
	{
		System.out.println("enter no.of choco");
		int n1=sc.nextInt();
		System.out.println("choco 1:"+n1);
		c=c+n1;
	}
	public void choco2()
	{
		System.out.println("enter no.of choco");
		int n2=sc.nextInt();
		System.out.println("choco 2:"+n2);
		c=c+n2;
	}
	
	
}
