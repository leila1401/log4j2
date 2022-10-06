package com.sts.demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class DemoMain {
	private static final Logger log =  LogManager.getLogger(DemoMain.class);

	public static void main(String[] args) {
		Demo demo = new Demo("Leila" , 29);
		Demo demo1 = new Demo("Top" , 2);
		Demo demo2 = new Demo("Leila" , 32);
		Demo demo3 = new Demo("Leila" ,33);
		
		
		
//		System.out.println(demo);
//		System.out.println(demo1);
//		System.out.println(demo2);
//		System.out.println(demo3);
		
		log.info("hello :" + demo);
		log.trace("hello :" + demo1);
		log.debug("hello :" + demo2);
		log.error("hello :" + demo3);
		

	}

}
