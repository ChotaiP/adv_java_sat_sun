package com.google.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServerEventListener implements ServletContextListener{
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("SERVER STARTED..............");
		
	}
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("SERVER SHUTDOWN..............");
	}
}
