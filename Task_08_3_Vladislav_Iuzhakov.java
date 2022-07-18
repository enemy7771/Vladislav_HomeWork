/**Класс Person
 Создать класс Person, который содержит:  переменные fullName, age;
 методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 Добавьте два конструктора  - Person() и Person(fullName, age).
 Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 */


public class Task_08_3_Vladislav_Iuzhakov {
    public static void main(String[] args) {
        //Создаём обьекты на основе пустого конструктора и конструктора с переменными
        Person person1 = new Person();
        Person person2 = new Person("Ivan Ivanov", 37);

        //Вызываем прописанные нами методы на созданных выше обьекта
        person1.talk();
        person1.move();
        person2.talk();
        person2.move();


    }
    public static class Person{//Создаём класс Person
        String fullName;
        int age;

        public Person() {//Пустой конструтор
        }

        public Person(String fulName, int age) {//Конструктор с переменными полное имя и возраст
            this.fullName = fulName;
            this.age = age;
        }

        public void move(){//Метод просто выводящий в консоль сообщение
            System.out.println("Двигается");
        }
        public void talk(){//Метод просто выводящий в консоль сообщение
            System.out.println("Такой-то Person говорит");
        }

        @Override
        public String toString() {//Переопределение toString
            return "Person{" +
                    "fulName='" + fullName + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
