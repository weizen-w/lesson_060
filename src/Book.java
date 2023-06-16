import java.util.Objects;

public class Book {

  // Создайте класс `Book` (книга), в конструктор которого передавайте автора, название книги и
  // количество страниц.
  private final String author;
  private final String title;
  private final int pages;

  public Book(String author, String title, int pages) {
    this.author = author;
    this.title = title;
    this.pages = pages;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getPages() {
    return pages;
  }

  @Override
  public String toString() {
    return "Book{author='" + author + "', title='" + title + "', pages=" + pages + "}";
  }

  // Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам,
  // а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке").

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Book book)) {
      return false;
    }
    return author.equalsIgnoreCase(book.author) && title.equalsIgnoreCase(book.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, title);
  }
}
