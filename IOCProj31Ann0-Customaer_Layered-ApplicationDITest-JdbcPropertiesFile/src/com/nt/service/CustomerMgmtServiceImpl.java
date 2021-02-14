package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;
@Service("custService")
public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	
	
@Autowired
//@Qualifier("oracleCustDAO")
@Qualifier("activeDAO")
private ICustomerDAO dao;

	@Override
	public String calculateSimpleIntrestAmount(CustomerDTO dto) throws Exception {
		//write b.logic to calculate simple intrAmount based on pAmt,rate,time
		float intrAmt=(dto.getPAmt()*dto.getRate()*dto.getTime())/100.0f;
		//prepared customerBO obj having persistence data
		CustomerBO bo=new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setPamt(dto.getPAmt());
		bo.setTime(dto.getTime());
		bo.setRate(dto.getRate());
		bo.setIntrAmt(intrAmt);
		//use DAO
		int count=dao.insert(bo);
		//immediate if or ternary operator apply
		return count==0?"Customer Registration Failed":"Customer Registration sucess::principle amount::"+dto.getPAmt()+"Time::"+dto.getTime()+"Rate::"+dto.getRate()+"Interst Amount::"+intrAmt;
	}

}
