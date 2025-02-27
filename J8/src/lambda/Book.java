package lambda;


public class Book {
  private Long id;
  private String name;

  public Book(Long id, String name) {
    this.id = id;
    this.name = name;
  }
  public Book(){

  }

  @Override
  public String toString() {
    return "Book{" +
      "id=" + id +
      ", name='" + name + '\'' +
      '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}
