public class Book {

    private short id; // Оптимізація використання пам'яті шляхом заміни int на short
    private String title;
    private String author;
    private String status;

    public Book (short id, String title, String author, String status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public short getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static void main(String[] args) {
        Book book1 = new Book((short) 1, "Айвенго", "Вальтер Скотт", "Доступна");
        Book book2 = new Book((short) 2, "Захар Беркут", "Іван Франко", "Доступна");
        Book book3 = new Book((short) 3, "Історія України-Руси", "Михайло Грушевський", "Зарезервована");
    }
}
