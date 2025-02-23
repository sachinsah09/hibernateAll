package HibernateCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateCRUD.Student;

public class DeleteStudent {

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
  Student student = (Student)session.load(Student.class, 1);
  session.delete(student);
  System.out.println("Deleted Successfully");
  session.getTransaction().commit();
     sessionFactory.close();
 }
}