package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.Audit;
import com.lti.app.repository.AuditRepo;
@Service
@Transactional
public class AuditServiceImpl implements AuditService {
	
	@Autowired
	AuditRepo aRepo;

	@Override
	public void addAudit(Audit audit) {
		// TODO Auto-generated method stub
		aRepo.addAudit(audit);
	}

	@Override
	public List<Audit> getaudit() {
		// TODO Auto-generated method stub
		return aRepo.getaudit();
	}

	@Override
	public boolean deleteAudit(Audit audit) {
		// TODO Auto-generated method stub
		return aRepo.deleteAudit(audit);
	}

	@Override
	public boolean updateAudit(Audit audit) {
		// TODO Auto-generated method stub
		return aRepo.updateAudit(audit);
	}

	@Override
	public Audit searchAuditById(String user_id) {
		// TODO Auto-generated method stub
		return aRepo.searchAuditById(user_id);
	}

}
