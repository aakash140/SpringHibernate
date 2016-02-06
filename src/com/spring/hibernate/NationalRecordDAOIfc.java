package com.spring.hibernate;

import org.springframework.orm.hibernate3.HibernateTemplate;

public interface NationalRecordDAOIfc {
	
	public void setTemplate(HibernateTemplate template);
	
	public void saveNational(National national);
	
	public void deleteNational(National national);
	
	public void updateNational(National national);
	
}