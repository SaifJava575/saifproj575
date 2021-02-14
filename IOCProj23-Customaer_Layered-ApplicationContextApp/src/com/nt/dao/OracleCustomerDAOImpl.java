package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public final class OracleCustomerDAOImpl implements ICustomerDAO {
	private static final String INSERT_CUSTOMER_QUERY="INSERT INTO LAYERED_CUSTOMER VALUES(CUSTNO_SEQ.NEXTVAL,?,?,?,?,?,?)";
	private DataSource ds;
	
public OracleCustomerDAOImpl(DataSource ds) {
		
		this.ds = ds;
	}

@Override
public int insert(CustomerBO bo) throws Exception {
		//get pooled jdbc con object
		Connection con=ds.getConnection();
		//create prepared statement object
		PreparedStatement ps=con.prepareStatement(INSERT_CUSTOMER_QUERY);
		//set value to query paams by collecting data from BO class obj
		ps.setString(1,bo.getCname());
		ps.setString(2,bo.getCadd());
		ps.setFloat(3, bo.getPamt());
		ps.setFloat(5,bo.getTime());
		ps.setFloat(4,bo.getRate());
		ps.setFloat(6,bo.getIntrAmt());
		//execute sql query
		int count=ps.executeUpdate();
		//close jdbc 
		ps.close();
		con.close();//release the jdbc con object back to jdbc con pool
		return count;
		
	}

}
