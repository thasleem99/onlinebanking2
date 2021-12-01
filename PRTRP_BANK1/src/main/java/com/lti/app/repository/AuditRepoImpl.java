package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Audit;
 
@Repository
public class AuditRepoImpl implements AuditRepo {
	
	@Autowired
	EntityManager eMan;

	@Override
	public void addAudit(Audit audit) {
		// TODO Auto-generated method stub
		eMan.persist(audit);
	}

	@Override
	public List<Audit> getaudit() {
		// TODO Auto-generated method stub
		Query qry=eMan.createQuery("from Audit");
		return qry.getResultList();
	}

	@Override
	public boolean deleteAudit(Audit audit) {
		// TODO Auto-generated method stub
		Audit ad=eMan.find(Audit.class, audit.getUser_id());
		eMan.remove(ad);
		return true;
	}

	@Override
	public boolean updateAudit(Audit audit) {
		// TODO Auto-generated method stub
		eMan.merge(audit);
		return true;
	}

	@Override
	public Audit searchAuditById(String user_id) {
		// TODO Auto-generated method stub
		Audit ad=eMan.find(Audit.class, user_id);
		 return ad;
	}

}
