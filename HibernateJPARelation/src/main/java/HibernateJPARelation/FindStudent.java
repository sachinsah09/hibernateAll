package HibernateJPARelation;

	import javax.persistence.*;  
	 
	public class FindStudent {  
	
		public static void main(String args[])  
	    {  
	        EntityManagerFactory emf=Persistence.createEntityManagerFactory("su");  
	        EntityManager em=emf.createEntityManager();  
	          	          
	        StudentEntity s=em.find(StudentEntity.class,101);  
	          
	        System.out.println("Student id = "+s.getS_id());  
	        System.out.println("Student Name = "+s.getS_name());  
	        System.out.println("Student Age = "+s.getS_age());  
	          
	    }  
	}  