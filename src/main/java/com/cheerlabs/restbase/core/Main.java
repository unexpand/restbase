package com.cheerlabs.restbase.core;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cheerlabs.restbase.persistence.ContactDao;

public class Main {
	 public static void main(String[] args) {
		 Properties prop = new Properties();
		 
		 prop = System.getProperties();
		 prop.getProperty("java.class.path"); 
		 
	 }

}
