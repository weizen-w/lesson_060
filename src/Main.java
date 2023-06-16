import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("Автор3", "Название2", 150));
    books.add(new Book("Автор2", "Название1", 120));
    books.add(new Book("Автор1", "Название1", 115));
    books.add(new Book("Автор2", "Название3", 150));
    books.add(new Book("Автор1", "Название1", 200));
    System.out.println(books);
    books.sort((o1, o2) -> {
      if (o1.getTitle().equals(o2.getTitle())) {
        return o1.getAuthor().compareTo(o2.getAuthor());
      }
      return o1.getTitle().compareTo(o2.getTitle());
    });
    System.out.println(books);
  }
}
