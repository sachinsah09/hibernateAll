package HibernateJPA_JPQLRelation;

import javax.persistence.*;  
public class UpdateData {  
      
     public static void main( String args[]) {  
             
          EntityManagerFactory emf = Persistence.createEntityManagerFactory( "su" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
            
           Query query = em.createQuery( "update StudentEntity SET s_age=25 where s_id>103");  
            query.executeUpdate();  
  
          em.getTransaction().commit();  
          em.close();  
          emf.close();    
     }  
}  