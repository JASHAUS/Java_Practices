package com.main;

public class Snippet2 {
	class Child1 extends Snippet2Main{}
	class Child2 extends Snippet2Main{}
	class Test
	{
	  public void main(String[] args)
	  {
		  Snippet2Main p =new Snippet2Main();
	      Child1 c1 = new Child1();
	      Child2 c2 = new Child2();
	      System.out.println(c1 instanceof Snippet2Main);		
	      System.out.println(c2 instanceof Snippet2Main);		
	      System.out.println(p instanceof Child1);		
	      System.out.println(p instanceof Child2);		
	      p = c1;
	      System.out.println(p instanceof Child1);		
	      System.out.println(p instanceof Child2);		
	      p = c2;
	      System.out.println(p instanceof Child1);		
	      System.out.println(p instanceof Child2);		
	   }
	}

}
