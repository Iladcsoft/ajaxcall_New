package com.cs.ne.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import com.cs.ne.bean.MainBean;

public class MainDAO extends DAOBase{
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	//private String ContentType;
	ArrayList<MainBean> getIdArray = new ArrayList<MainBean>();
	ArrayList<MainBean> myStudentDetailArray = new ArrayList<MainBean>();
	public ArrayList<MainBean> getStudentId(MainBean mBean) throws DAOException, SQLException {
		// TODO Auto-generated method stub
		//System.out.println("cmg to dao");
		try
		{
		con=getConnection();
		ps=con.prepareStatement(Constants.getIdDetails);
		  rs = ps.executeQuery();
		    while(rs.next()){
		    	
		    	MainBean ra=new MainBean();
				ra.setId(rs.getString("id"));
				//session.clear();
				//System.out.print("name");
				//session.put("contentsearch",rs.getString("name"));
				getIdArray.add(ra);
		    }
	}
		    
		    catch (Exception e) {
				// TODO: handle exception
			}
			finally
			{
				
				con.close();
				ps.close();
				rs.close();
			}  
		return getIdArray;
	}
	public ArrayList<MainBean> getStudentDetails(String x) throws DAOException, SQLException {
		// TODO Auto-generated method stub
		
		try{
		con=getConnection();
		
		ps=con.prepareStatement(Constants.getStudentDetails);
		ps.setString(1, x);
		  rs = ps.executeQuery();
		    while(rs.next()){
		    	
		    	MainBean ra=new MainBean();
				
ra.setName(rs.getString("name"));
ra.setPhone(rs.getString("phone"));
ra.setMail(rs.getString("mail"));
myStudentDetailArray.add(ra);
		    }
		    
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			
			con.close();
			ps.close();
			rs.close();
		}
		return myStudentDetailArray;
	}

	

}
