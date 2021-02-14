package com.nt.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtService;
@Controller
public class EmployeeController {
	
	@Autowired
	private IEmployeeMgmtService service;
	
	@GetMapping("/welcome")
	public String showHome() {
		return "home";
	}
	@GetMapping("/list_emps")
	public String collectAllEmployees(Map<String,Object>map) {
		//use service
		List<EmployeeDTO> listDTO=service.fetchAllEmps();
		//keeps resultd in model Architecture
		map.put("listDTO", listDTO);
		//return lvn
		return "show_emps";
	}
}
