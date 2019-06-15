package HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberMain {

	public static void main(String args[])
	{
		
		UserDetails ud = new UserDetails();
	
	
		ud.setUserId(17);
		ud.setUserName("sachin");
		
		
		

		SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
		
		
		Session session=sessionFactory.openSession();
		 session.beginTransaction();
		 session.save(ud);
		 session.getTransaction().commit();
	
	}
	
}
