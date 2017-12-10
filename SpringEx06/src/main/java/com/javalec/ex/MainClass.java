package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLoc = "classpath:applicationCTX.xml";
		String configLoc1 = "classpath:applicationCTX1.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc,configLoc1);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getHobbys());
		
		StudentInfo studentInfo = ctx.getBean("studentinfo", StudentInfo.class);
		Student student2 = studentInfo.getStudent();
		System.out.println(student2.getName());
		System.out.println(student2.getHobbys());
		
		if(student1.equals(student2))
			System.out.println("stuents1.equals(student2)");
		
		Student student3 = ctx.getBean("student3", Student.class);
		System.out.println(student3.getName());
		System.out.println(student3.getHobbys());
		
		if(student1.equals(student3))
			System.out.println("stuents1.equals(student2)");
		else
			System.out.println("not stuents1.equals(student2)");
			
		
		Family family = ctx.getBean("family", Family.class);
		System.out.println(family.getPapaName());
		System.out.println(family.getMamaName());
		System.out.println(family.getBrotherName());
		System.out.println(family.getSisterName());
		
		ctx.close();
	}

}
