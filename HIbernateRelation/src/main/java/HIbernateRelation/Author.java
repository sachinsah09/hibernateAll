package HIbernateRelation;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {

   @Id
   @GeneratedValue
   @Column(name = "author_id")
   private long id;

   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "book_id")
   private Book book;
   
   
   public Book getBook() {
	return book;
}

public void setBook(Book book) {
	this.book = book;
}

@Column(name = "name")
   private String name;

   @Column(name = "email")
   private String email;

   public Author() { }

   public Author(String name, String email) {
       this.name = name;
       this.email = email;
   }

   public long getId() {
       return id;
   }

   public void setId(long id) {
       this.id = id;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
   }  
}