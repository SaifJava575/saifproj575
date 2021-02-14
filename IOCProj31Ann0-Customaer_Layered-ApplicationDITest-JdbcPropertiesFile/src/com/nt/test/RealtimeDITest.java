package com.nt.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.BankController;
import com.nt.vo.CustomerVO;

public class RealtimeDITest {

	public static void main(String[] args) {
	//create IOC Container
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/appilcationContext.xml");
	
		
		BankController controller=ctx.getBean("controller",BankController.class);
		//read input from enduser
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Customer Name::");
		String name=sc.next();
		
		System.out.println("Enter the Customer Address::");
		String addrs=sc.next();
		
		System.out.println("Enter the Principle Amount::");
		String pAmt=sc.next();
		
		System.out.println("Enter rate of Interest::");
		String rate=sc.next();
		
		System.out.println("Enter time of Interest::");
		String time=sc.next();
		
		//create customervo class obj having all inputs
		CustomerVO vo=new CustomerVO();
		vo.setCname(name);
		vo.setCadd(addrs);
		vo.setPAmt(pAmt);
		vo.setRate(rate);
		vo.setTime(time);
		//invoke method
		try {
			//use controller class
			String result=controller.processCustomer(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("Problem in Customer Registration");
			e.printStackTrace();
		}
	}//main

}//class
