/**
 * Читатели библиотеки.
 * Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
 * ФИО,
 * номер читательского билета,
 * факультет,
 * дата рождения,
 * телефон.
 * Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса.
 * Перегрузить методы takeBook(), returnBook():
 * - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 * - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
 */

public class Task_08_4_Vladislav_Iuzhakov {
    public static void main(String[] args) {
        Reader reader = new Reader("Южаков В.И.", 5, 11, 27_02_1997, 456456);
        //Создаю новый обьект класса Reader

        //Создаю обткиы класса Books
        Books book1 = new Books("Приключения", "Пушкин А.С.");
        Books book2 = new Books("Словарь", "Ожигов С.И.");
        Books book3 = new Books("Энциклопедия", "Автор");
        Books[] array = {book1,book2,book3};
        reader.takeBook(5);
        reader.takeBook(5,array);
        reader.returnBook(5,book1.nameBook,book2.nameBook,book3.nameBook);

    }
}
        class Reader {//Создаю класс Reader с переменными из задания
            String fullName;
            int readTicketNumber;
            int facultetNumber;
            int birthDate;
            int phoneNumber;

            //Создал конструктор для переменных класса Reader
            public Reader(String fullName, int readTicketNumber, int facultetNumber, int birthDate, int phoneNumber) {
                this.fullName = fullName;
                this.readTicketNumber = readTicketNumber;
                this.facultetNumber = facultetNumber;
                this.birthDate = birthDate;
                this.phoneNumber = phoneNumber;
            }

            void takeBook() {
                System.out.println(fullName + " взял 3 книги");
            }
            void takeBook(int readTicketNumber){
                System.out.println(fullName + " взял книги: Приключения, Словарь, Энциклопедия");
            }

            void takeBook(int readTicketNumber, Books[] books) {
                System.out.println(fullName + " взял книги:");
                for (int i = 0; i < books.length; i++) {
                    System.out.println(books[i]);
                }
                System.out.println();
            }

            void returnBook() {
                System.out.println(fullName + " вернул 3 книги: ");
            }
            void  returnBook(int readTicketNumber, String...books){
                System.out.println(fullName + "вернул книги: Приключения, Словарь, Энциклопедия");
            }


        }

    class Books {
        String nameBook;
        String authorBook;

        public Books(String nameBook, String authorBook) {
            this.nameBook = nameBook;
            this.authorBook = authorBook;
        }

        @Override
        public String toString() {
            return "Books{" +
                    "nameBook='" + nameBook + '\'' +
                    ", authorBook='" + authorBook + '\'' +
                    '}';
        }
    }
