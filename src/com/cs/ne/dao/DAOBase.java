package com.cs.ne.dao;

//import java.io.IOException;



import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.apache.struts2.ServletActionContext;
public class DAOBase implements DAO {
	

	public Connection getConnection() throws DAOException { 
		ServletContext servletContext = ServletActionContext.getServletContext(); 
		DataSource dataSource = (DataSource) servletContext.getAttribute("dataSource"); 
		Connection connection = null; 
		if (dataSource != null) { 
			try { 
				connection = (Connection) dataSource.getConnection();
				//System.out.println("connection in DAOBase: "+connection); 
				} catch (SQLException e) { 		
					System.out.println(e.getMessage());
					 throw new DAOException(); 
					 
					} 
				} 
		return connection; 
		}

	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		// TODO Auto-generated method stub
		
	}



 

}
