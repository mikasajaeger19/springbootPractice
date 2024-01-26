package mysqltest.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Paper {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String title;
  private Boolean approved;
  private String author;
  private String shortdesc;
  private String abstractText;

  // Constructors
  public Paper() {
  }

  public Paper(String title, Boolean approved, String author, String shortdesc, String abstractText) {
    this.title = title;
    this.approved = approved;
    this.author = author;
    this.shortdesc = shortdesc;
    this.abstractText = abstractText;
  }

  // Getter and Setter methods
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Boolean getApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getShortdesc() {
    return shortdesc;
  }

  public void setShortdesc(String shortdesc) {
    this.shortdesc = shortdesc;
  }

  public String getAbstractText() {
    return abstractText;
  }

  public void setAbstractText(String abstractText) {
    this.abstractText = abstractText;
  }
}
