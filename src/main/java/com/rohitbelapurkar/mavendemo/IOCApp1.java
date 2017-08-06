package com.rohitbelapurkar.mavendemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		//create application context 
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		Organization org = (Organization) context.getBean("myorg");
		
		org.corporateSlogan();
		
		//Close the application context
		((FileSystemXmlApplicationContext)context).close();
	}
}
