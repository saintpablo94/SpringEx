package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX.xml" ;
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyCalcurator myCalcurator= ctx.getBean("myCalcurator", MyCalcurator.class);
		
		myCalcurator.add();
		myCalcurator.substract();
		myCalcurator.multi();
		myCalcurator.divide();
		
	}
}
