package org.jsp.hibernate_demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserTest 
{

	public static void main(String[] args) 
	{
      Configuration cfg= new Configuration().configure();
      SessionFactory factory=cfg.buildSessionFactory();
	}

}
