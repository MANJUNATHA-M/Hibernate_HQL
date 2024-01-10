package com.hibernate.hql.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class App 
{
	public static void main( String[] args )
	{

		Configuration cfg=new Configuration().configure().addAnnotatedClass(Fruit.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();

		// GET THE ALL DETAILS FROM THE DATA BASE USING HQL

		//		System.out.println("------------------------------------------------");
		//			
		//		Query query=session.createQuery("from Fruit");
		//		List<Fruit> fruitslist=query.list();
		//
		//		for(Fruit fruit:fruitslist)
		//		{
		//			System.out.println(fruit);
		//
		//		}
		//		System.out.println("--------------------------------------------------");


		// to delete the row present in the database
		
		//		System.out.println("---------------------------------------");
		//		
		//		Query query=session.createQuery("delete from Fruit where fId=4");
		//		int rows=query.executeUpdate();
		//		
		//		System.out.println(rows + " Got Deleted Successfully");
		//		
		//System.out.println("--------------------------------------------------");
		
		// to insert into table
		
		//System.out.println("-----------------------------------------------------");
		//
		
	    	Query query = session.createQuery("update Fruit set fID=6 where id=5");
	    	
	    
		trans.commit();
		session.close();
	}
}
