package HibernateProjectImp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import HibernateProjectImp.Student;

@Entity  
@Table(name="addresshiber")  
public class AddressDetails {
	
	@Id  
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int a_id;  
	private String a_city;

	 @ManyToOne
	 @JoinColumn(name = "student_id")
	    private Student student;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getA_city() {
		return a_city;
	}
	public void setA_city(String a_city) {
		this.a_city = a_city;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	
	

}
