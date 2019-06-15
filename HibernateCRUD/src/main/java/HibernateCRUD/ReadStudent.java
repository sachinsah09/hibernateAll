package HibernateCRUD;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateCRUD.Student;

public class ReadStudent {

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
  Query query = session.createQuery("from Student");
  List students = query.list();
  Iterator it = students.iterator();
  
  while(it.hasNext())  
  {
    Student std = (Student)it.next();
    System.out.println("Roll Number: "+std.getRollNumber()+", Student Name: "+std.getStudentName()+", Course: "+std.getCourse());
  }
  session.getTransaction().commit();
  sessionFactory.close();
 }
}