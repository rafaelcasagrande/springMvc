package exemploModel;
// Generated 06/12/2014 21:53:51 by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

/**
 * Book generated by hbm2java
 */
public class Book  implements java.io.Serializable {


     private int id;
     private String isbn;
     private String title;
     private Date dateEdition;
     private String edition;
     private String editor;

    public Book() {
    }

	
    public Book(int id) {
        this.id = id;
    }
    public Book(int id, String isbn, String title, Date dateEdition, String edition, String editor) {
       this.id = id;
       this.isbn = isbn;
       this.title = title;
       this.dateEdition = dateEdition;
       this.edition = edition;
       this.editor = editor;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getIsbn() {
        return this.isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getDateEdition() {
        return this.dateEdition;
    }
    
    public void setDateEdition(Date dateEdition) {
        this.dateEdition = dateEdition;
    }
    public String getEdition() {
        return this.edition;
    }
    
    public void setEdition(String edition) {
        this.edition = edition;
    }
    public String getEditor() {
        return this.editor;
    }
    
    public void setEditor(String editor) {
        this.editor = editor;
    }


    public static List<Book> getAllBooks()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Book> books = new ArrayList<Book>(session.createQuery("from Book").list());

        session.close();

        return books;
    }
}


