package com.springmvc.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public final class EntityManagerFactory {
	
	
	static Session session;

   @SuppressWarnings("deprecation")
public static Session get() {
    	try{
    		
    		if(session == null){
    				SessionFactory sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
    				 session = sessionfactory.openSession();
    		}
    	
    	}catch(Exception e){
    		e.printStackTrace();
    	}
        return session;
    }
}
