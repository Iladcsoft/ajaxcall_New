package com.cs.ne.dao;
import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
public interface DAO {
	public Connection getConnection() throws DAOException;

	void setServletRequest(HttpServletRequest servletRequest);
}
