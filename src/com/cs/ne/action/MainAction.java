package com.cs.ne.action;

import java.sql.SQLException;
import java.util.ArrayList;

//Comments Added One
import com.cs.ne.bean.MainBean;
import com.cs.ne.dao.DAOException;
import com.cs.ne.dao.MainDAO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MainAction extends ActionSupport implements ModelDriven<MainBean>{
	private MainBean mBean=new MainBean();
	private String sample="Text";
	public String getSample() {
		return sample;
	}

	public void setSample(String sample) {
		this.sample = sample;
	}

	public MainBean getmBean() {
		return mBean;
	}

	public void setmBean(MainBean mBean) {
		this.mBean = mBean;
	}

	private ArrayList<MainBean> getIdArray = new ArrayList<MainBean>();
	private ArrayList<MainBean> myStudentDetailArray = new ArrayList<MainBean>();
	public ArrayList<MainBean> getGetIdArray() {
		return getIdArray;
	}

	public void setGetIdArray(ArrayList<MainBean> getIdArray) {
		this.getIdArray = getIdArray;
	}


	private static final long serialVersionUID = 1L;

	public String execute()
	{
		
		try {
			
			getIdArray=new MainDAO().getStudentId(mBean);
			
			for(MainBean bo:getIdArray)
			{
				//System.out.println(bo.getId()+"checkpaanki");
			}
			
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "success";
		
	}
	
	public String getstudent()
	{
		
		
				//System.out.println(mBean.getId()+"let c");
				
				try {
					setmBean(mBean);
					myStudentDetailArray=new MainDAO().getStudentDetails(mBean.getId());
					for(MainBean mBean:myStudentDetailArray)
					{
						//System.out.println(mBean.getName()+"checkqwererf");
					}
					
					
				} catch (DAOException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		return "success";
	}
	
	

	@Override
	public MainBean getModel() {
		// TODO Auto-generated method stub
		return this.mBean;
	}

	public ArrayList<MainBean> getMyStudentDetailArray() {
		return myStudentDetailArray;
	}

	public void setMyStudentDetailArray(ArrayList<MainBean> myStudentDetailArray) {
		this.myStudentDetailArray = myStudentDetailArray;
	}

	
}
