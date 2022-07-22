/**
 * Студент
 * Метод main класса Solution создает объект класса Student с конкретным именем, но программа не компилируется.
 * Тебе нужно исправить ошибку в классе Student, чтобы программа компилировалась, и при запуске в консоль выводилось имя студента.
 *
 *
 * Requirements:
 * 1. Метод main не изменяй.
 * 2. В классе Student должен быть конструктор с одним параметром.
 * 3. Конструктор должен инициализировать поле name полученным аргументом.
 */

public class Task_08_13_Vladislav_Iuzhakov {
    public static void main(String[] args) {
        Student student = new Student("Амиго");
        System.out.println(student.name);
    }
}
class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}