package com.gradle.first;

public class variables 
{
	int first=1;//instance variable
	public static int second=2;//static/class/global variable
	
	public void FirstGradle()
	{
		String s="tejaswi";//local variable
		System.out.println(s);
	}
	

	public static void main(String[] args)
	{
		variables v = new variables();
		
		
	System.out.println(v.first);
	System.out.println(v.second);
	v.FirstGradle();
	}

}
