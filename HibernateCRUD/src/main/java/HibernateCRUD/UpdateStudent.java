package HibernateCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateCRUD.Student;


public class UpdateStudent {

 /**
  * @param args
  */
 public static void main(String[] args) 
 {
  //Create session factory object
  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
  //getting session object from session factory
  Session session = sessionFactory.openSession();
  //getting transaction object from session object
  session.beginTransaction();
  
  Student student = (Student)session.get(Student.class, 1);
  student.setStudentName("SWAPNEEL DESHMUKH");
  System.out.println("Updated Successfully");
  session.getTransaction().commit();
  sessionFactory.close();
 }
}