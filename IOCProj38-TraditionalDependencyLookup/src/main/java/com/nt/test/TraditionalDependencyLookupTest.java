package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class TraditionalDependencyLookupTest {

	public static void main(String[] args) {
		//crete IOC container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("....................");
		//get Target Bean Class Object
		Cricketer cricketer=ctx.getBean("cricketer",Cricketer.class);
		System.out.println("...............");
		//invoke the methods
		cricketer.batting();
		System.out.println("..............");
		cricketer.bowling();
		System.out.println("................");
		cricketer.fielding();
		System.out.println(".........................");
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}//method

}//class
