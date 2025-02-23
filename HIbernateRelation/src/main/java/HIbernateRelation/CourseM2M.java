package HIbernateRelation;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class CourseM2M {

	@Id
	 @GeneratedValue
		private int courseId;
		private String courseName;
		private int duration;

	@ManyToMany
		private Set<StudentM2M> studentm2m;

		public int getCourseId() {
			return courseId;
		}

		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		CourseM2M(){
			
		}
		
		CourseM2M(int courseId,String courseName,int duration)
		{
			this.courseId=courseId;
			this.courseName=courseName;
			this.duration=duration;
		}

		public Set<StudentM2M> getStudents() {
			return studentm2m;
		}

		public void setStudents(Set<StudentM2M> students) {
			this.studentm2m = students;
		}	

			}