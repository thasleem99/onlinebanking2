package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.Audit;

public interface AuditRepo 
{
	public void addAudit(Audit audit);
	public List<Audit>getaudit();
	public boolean deleteAudit(Audit audit);
	public boolean updateAudit(Audit audit);
	public Audit searchAuditById(String user_id);
}
