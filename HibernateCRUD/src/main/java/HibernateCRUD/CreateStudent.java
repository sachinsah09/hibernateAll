package HibernateCRUD;
	
	
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


	

	public class CreateStudent {

	 /**
	  * @param args
	  */
	 public static void main(String[] args) 
	 {
	  //Create student entity object
	  Student student = new Student();
	  student.setStudentName("Sachin Sah");
	  student.setRollNumber(01);
	  student.setCourse("BTECH(CSE)");	  
	  //Create session factory object

		SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
		
	  //getting session object from session factory
	  Session session = sessionFactory.openSession();
	  //getting transaction object from session object
	  session.beginTransaction();
	  
	  session.save(student);
	  System.out.println("Inserted Successfully");
	  session.getTransaction().commit();
	  session.close();
	  sessionFactory.close();
	 }
	}


