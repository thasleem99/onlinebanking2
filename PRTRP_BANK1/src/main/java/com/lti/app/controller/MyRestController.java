package com.lti.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.Audit;
 
import com.lti.app.service.AuditService;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class MyRestController 
{
	@Autowired
	AuditService auditservice;
	
	@GetMapping("/audit")
	public List<Audit> getaudit()
	{
		return auditservice.getaudit();
	}
	@PostMapping("/audit")
	public boolean addAudit(@RequestBody Audit audit)
	{
		auditservice.addAudit(audit);
		return true;
	}
	
	@DeleteMapping("/audit/{user_id}")
	public boolean deleteaudit(@PathVariable(name="user_id") String user_id)
	{
		Audit Savings=auditservice.searchAuditById(user_id);
		return auditservice.deleteAudit(Savings);
	}
	@PutMapping("/audit")
	public boolean updateAudit(@RequestBody Audit audit)
	{
		return auditservice.updateAudit(audit);
	}	

}
