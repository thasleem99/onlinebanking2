package com.lti.app.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="audit01")
public class Audit 
{
	@Override
	public String toString() {
		return "Audit [user_id=" + user_id + ", date=" + session_date + "]";
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Date getDate() {
		return session_date;
	}
	public void setDate(Date date) {
		this.session_date = date;
	}
	@Id
	private String user_id;
	private Date session_date;
	public Audit() {
		super();
		// TODO Auto-generated constructor stub
	}
}
	 