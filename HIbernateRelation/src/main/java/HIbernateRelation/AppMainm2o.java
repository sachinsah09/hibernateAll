package HIbernateRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
 
public class AppMainm2o {

 
 
 
    public static void main(String[] args) {
        System.out.println(".......Hibernate One To Many Mapping Example.......\n");

      	  //Create session factory object
        	 //Create session factory object
      	  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
      	  //getting session object from session factory
      	  Session session = sessionFactory.openSession();
      	  //getting transaction object from session object
      	  session.beginTransaction();
      	  
            Studentm2o studentObj = new Studentm2o("Java", "Geek",  "javageek@javacodegeeks.com", "0123456789");
            session.save(studentObj);
 
            MarksDetails marksObj2 = new MarksDetails("Maths", "100", "90",  "Pass");  
            marksObj2.setStudent(studentObj);  
           
            MarksDetails marksObj1 = new MarksDetails("English", "100", "90",  "Pass");  
            marksObj1.setStudent(studentObj);  
            session.save(marksObj1);
            session.save(marksObj2);
 
 
 
            // Committing The Transactions To The Database
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
 
            System.out.println("\n.......Records Saved Successfully To The Database.......");
    }
}