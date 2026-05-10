public class Librarian {

    private byte id; // Оптимізація використання пам'яті шляхом заміни int на byte
    private String name;

    public Librarian(byte id, String name) {
        this.id = id;
        this.name = name;
    }

    public byte getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void confirmReservation(Book book) {
        book.setStatus("Зарезервована");
    }

    public void cancelReservation(Book book) {
        book.setStatus("Доступна");
    }

    public static void main(String[] args) {
        Librarian admin = new Librarian((byte) 1, "Головний бібліотекар");
        Librarian assistant = new Librarian((byte) 2, "Помічник бібліотекаря");
    }
}
