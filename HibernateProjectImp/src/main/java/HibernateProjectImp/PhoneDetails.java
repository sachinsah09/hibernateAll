package HibernateProjectImp;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity  
@Table(name="phonehiber")  

public class PhoneDetails {

	
	    @Id  
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int p_id;  
    
	    @ManyToOne
		 @JoinColumn(name = "student_id")
		    private Student studentphone;
	    
		public Student getStudentphone() {
			return studentphone;
		}



		public void setStudentphone(Student studentphone) {
			this.studentphone = studentphone;
		}



		public int getP_id() {
			return p_id;
		}

    
    
		public void setP_id(int p_id) {
			this.p_id = p_id;
		}

		public String getP_no() {
			return p_no;
		}

		public void setP_no(String p_no) {
			this.p_no = p_no;
		}

	private String p_no;  
  
      
    public PhoneDetails(int p_id, String p_no) {  
        super();  
        this.p_id = p_id;  
        this.p_no = p_no;  
         }  
  
    public PhoneDetails() {  
        super();  
    }  
  
       
}  

	
	
	
	

