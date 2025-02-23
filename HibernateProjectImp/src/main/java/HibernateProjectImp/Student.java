package HibernateProjectImp;

import java.util.Set;

import javax.persistence.*;

import HibernateProjectImp.AddressDetails;  

@Entity  
@Table(name="studenthiber")  
public class Student {  
  
    @Id
    @GeneratedValue
    private int s_id;  
    private String s_name;  
   

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @OneToMany( cascade = CascadeType.ALL)
    private Set<AddressDetails> addressDetails;
    
   public Set<AddressDetails> getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(Set<AddressDetails> addressDetails) {
		this.addressDetails = addressDetails;
	}

		@GeneratedValue(strategy=GenerationType.IDENTITY)
	    @OneToMany( cascade = CascadeType.ALL)
	    private Set<PhoneDetails> phoneDetails;

	
	public Set<PhoneDetails> getPhoneDetails() {
			return phoneDetails;
		}

		public void setPhoneDetails(Set<PhoneDetails> phoneDetails) {
			this.phoneDetails = phoneDetails;
		}

	public Student(int s_id, String s_name) {  
        super();  
        this.s_id = s_id;  
        this.s_name = s_name;  
      }  
  
    public Student() {  
        super();  
    }  
  
    public int getS_id() {  
        return s_id;  
    }  
  
    public void setS_id(int s_id) {  
        this.s_id = s_id;  
    }  
  
    public String getS_name() {  
        return s_name;  
    }  
  
    public void setS_name(String s_name) {  
        this.s_name = s_name;  
    }  
  
        
}  
