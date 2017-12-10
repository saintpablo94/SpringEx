package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:applicationCTX.xml");
		System.out.println("main : before refresh");
		ctx.refresh();
		System.out.println("main : after refresh");
		
		System.out.println("main : before close");
		ctx.close();
		System.out.println("main : after close");
	}

}
