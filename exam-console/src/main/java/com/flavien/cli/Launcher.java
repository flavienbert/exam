package com.flavien.cli;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flavien.cli.component.Menu;



/**
 * 
 * Command line interface to Launch the app.
 * 
 */


public class Launcher {

	public static void main(String[] args) {	

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("application-context-console.xml");		
		Menu m = ctx.getBean(Menu.class);
		m.run();
		ctx.close();
	}

}
