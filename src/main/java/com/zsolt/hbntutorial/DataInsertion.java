package com.zsolt.hbntutorial;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.fabric.xmlrpc.base.Data;

public class DataInsertion {

	public static void main(String[] args) {
		
		new DataInsertion().insertInfo();

	}
	
	public void insertInfo()
	{
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = conf.buildSessionFactory();
		Session session = sessionFactory.openSession();
		DataProvider provider = new DataProvider();
		provider.setMovieID(12);
		provider.setReleaseDate(new Date());
		provider.setTitle("Chaos Theory");
		
		Transaction transaction = session.beginTransaction();
		session.save(provider);
		System.out.println("Object Saved");
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
