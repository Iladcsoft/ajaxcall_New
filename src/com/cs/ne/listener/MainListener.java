package com.cs.ne.listener;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

public class MainListener implements ServletContextListener{
	public void contextInitialized(ServletContextEvent sce) { 
		ServletContext servletContext = sce.getServletContext(); 
		System.out.println("connection");
		//String dataSourceJndiName = servletContext .getInitParameter("dataSourceJndiName"); 
		try { 
			Context initContext  = new InitialContext();             
			Context envContext  = (Context)initContext.lookup("java:/comp/env"); 
			
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/Image");
			//DataSource dataSource = (DataSource) envContext.lookup("jdbc/OneCAAPinventory");		
			//DataSource dataSource = (DataSource) envContext.lookup("jdbc/OneCAAPinventoryUAT");
			//DataSource dataSource = (DataSource) envContext.lookup("jdbc/OneCAAPinventorySearch");
			servletContext.setAttribute("dataSource", dataSource); 
			//System.out.println("InfoPediA dataSource Listener: "+dataSource);
		
		
			} catch (NamingException e) 
			{ 
				e.printStackTrace();
				throw new RuntimeException(e); 
			} 
				
	}
	public void contextDestroyed(ServletContextEvent cse) { }

}
