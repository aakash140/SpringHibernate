package com.spring.hibernate;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class NationalRecordDAO implements NationalRecordDAOIfc {

	HibernateTemplate template=null;
	public void setTemplate(HibernateTemplate template){
		this.template=template;
	}
	
	public void saveNational(National national){
		template.save(national);
	}
	
	public void deleteNational(National national){
		template.delete(national);
	}
	
	public void updateNational(National national){
		template.update(national);
	}
}