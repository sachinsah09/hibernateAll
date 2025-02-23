package HIbernateRelation;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMainM2M {


	 
    public static void main(String[] args) {
        System.out.println(".......Hibernate Many To Many Mapping Example.......\n");

      	  //Create session factory object
        	 //Create session factory object
      	  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
      	  //getting session object from session facto
      	  Session session = sessionFactory.openSession();
      	  //getting transaction object from session object
      	
      	  
      	session.beginTransaction();    
      
       
 	 
           
            CourseM2M course = new CourseM2M(1,"Btech(CSE)",2);
            session.save(course); 
            CourseM2M course1 = new CourseM2M(10,"Btech(MECH)",4);
            session.save(course1); 
            
            
    		Set<CourseM2M> s =new HashSet<CourseM2M>();
		      s.add(course);
		      s.add(course1);
  
           
		     	StudentM2M student= new StudentM2M(1,  "Sachin Sah", 80);
		    	 student.setCourses(s);
		     	session.save(student); 
	    	 	
	      	StudentM2M student1= new StudentM2M(2,  "Swapneel Deshmukh", 90);
	    	 student1.setCourses(s);
	      	session.save(student1);
           

    		     
    		
    		     
    	 
    	
 
            
            // Committing The Transactions To The Database
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
 
            System.out.println("\n.......Records Saved Successfully To The Database.......");
    }
}