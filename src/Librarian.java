public class Librarian {

    /*
    Для змінних зазначено модифікатори private,
    тому що саме такий формат забезпечує використання геттерів та сеттерів
    і захищає дані від некоректної зміни
    */
    private byte id; // Оптимізація використання пам'яті шляхом заміни int на byte
    private String name;

    /*
    Для конструктора використано модифікатор public для того,
    щоб інші класи мали можливість створювати об’єкти цього класу
    */
    public Librarian(byte id, String name) {
        this.id = id;
        this.name = name;
    }

    /*
    Для геттерів використано модифікатор public, тому що
    інші класи повинні мати можливість взаємодіяти з об'єктами цього класу
    шляхом контрольованого доступу до даних
    */
    public byte getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /*
    Для методів confirmReservation та cancelReservation застосовано
    модифікатор public, оскільки ці методи мають бути доступними іншим класам
    */
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
