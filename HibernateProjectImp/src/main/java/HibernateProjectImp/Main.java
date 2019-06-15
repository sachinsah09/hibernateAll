package HibernateProjectImp;

import  java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateProjectImp.AddressDetails;
import HibernateProjectImp.Student;
import HibernateProjectImp.Student;

public class Main {
	
    public static void main(String[] args) {
       
    		System.out.println(".......Executinh HIbernate Project OneTOMany Student-Address\n");
    	
      		SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
      		Session session = sessionFactory.openSession();
      		
        	  session.beginTransaction();

    		
    	Scanner sc = new Scanner(System.in);

    	System.out.println("Enter your Student_Name : ");
		String s_name = sc.next().toString(); 
		
		  Student studentObj = new Student();
		  studentObj.setS_name(s_name);
		  session.save(studentObj);

		  System.out.println("Enter Your City : ");
		  String city = sc.next().toString(); 
			
          AddressDetails addressObj1 = new AddressDetails();  
          addressObj1.setA_city(city);
          addressObj1.setStudent(studentObj);  
        
          System.out.println("Enter Your Another City : ");
		  String city1 = sc.next().toString(); 
		
          AddressDetails addressObj2 = new AddressDetails();  
          addressObj2.setA_city(city1);
          addressObj2.setStudent(studentObj);  
         
          
          System.out.println("Enter Your PhoneNO. : ");
		  String ph1 = sc.next().toString(); 
		
          PhoneDetails  phoneObj1 = new PhoneDetails();  
          phoneObj1.setP_no(ph1);
          phoneObj1.setStudentphone(studentObj);  
         
          System.out.println("Enter Your PhoneNO 2. : ");
		  String ph2 = sc.next().toString(); 
		
          PhoneDetails  phoneObj2 = new PhoneDetails();  
          phoneObj2.setP_no(ph2);
          phoneObj2.setStudentphone(studentObj);  
          
          
          
          session.save(addressObj1);
          session.save(addressObj2);
          session.save(phoneObj1);
          session.save(phoneObj2);
          

		  
          System.out.println("Student-Address Successfully");
          session.getTransaction().commit();
          session.close();
          sessionFactory.close();
  	 
  
    }
  }


    	

