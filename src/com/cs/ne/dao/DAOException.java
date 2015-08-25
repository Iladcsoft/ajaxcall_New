package com.cs.ne.dao;

public class DAOException extends Exception {
		/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
		public DAOException(){
			
		}
		public String getError(){
			return "Sorry for the inconvenience,Please contact administrator.";
		}
	}

