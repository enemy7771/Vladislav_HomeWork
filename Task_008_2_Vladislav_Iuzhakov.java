import java.util.Arrays;

/**(ООП) Класс MobilePhone.
 Создайте класс MobilePhone, который содержит переменные number, model и weight.
 Создайте три экземпляра этого класса.
 Выведите на консоль значения их переменных.
 Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
 Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
 Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
 Добавить конструктор без параметров.
 Вызвать из конструктора с тремя параметрами конструктор с двумя.
 Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
 Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
 Метод выводит на консоль номера этих телефонов.
 */




public class Task_008_2_Vladislav_Iuzhakov {
    public static void main(String[] args) {
        MobilPhone mobilPhone1 = new MobilPhone(4534,"Iphone 13 Pro Max",173.25);
        MobilPhone mobilPhone2 = new MobilPhone(7775553, "Samsung A50",230.45);
        MobilPhone mobilPhone3 = new MobilPhone(880055535,"Nokia N8",130.77);
        System.out.println(mobilPhone1);
        System.out.println(mobilPhone2);
        System.out.println(mobilPhone3);
        System.out.println();
        System.out.println(mobilPhone1.ReceiveCall("Igor ") + mobilPhone1.getNumber());
        System.out.println();
        System.out.println(mobilPhone2.ReceiveCall("Mike", 88005454));
        System.out.println();
        System.out.println(mobilPhone3.sendMessage("4462","1564","458987","79874"));


    }
    public static class MobilPhone{//Создаём класс с переменным прописанными в задании
        int number;
        String model;
        double weight;

        public void MobilPhone1() {//Контруктор без параметров
        }

        public void MobilPhone2(int number, String model2) {//Конструктор с двумя параметрами
            this.number = number;
            this.model = model2;

        }

        public MobilPhone(int number, String model, double weight) {//Конструктор с тремя параметрами
            this.number = number;
            this.model = model;
            this.weight = weight;
            MobilPhone2(456456, "Iphone 7");//Вызов конструктора с двумя параметрами в конструкторе
            // с тремя параметрами
        }

        public String ReceiveCall(String name){//Метод который выводит в консоль имя звонящего
            String call = "Звонит: " + name;
            return call;
        }

        public String ReceiveCall(String name, int number){//Метод который выводит в консоль имя звонящего и его номер
            String call = "Звонит: " + name + "," + " Номер звонящего: " + number;
            return call;
        }

        public int getNumber() {//Метод который возвращает номер телефона
            return number;
        }

        public String sendMessage(String... numbers){//Метод который принимает на вход номера телефонов, которым
            // будет отправлено сообщение. И выводит эти номера в консоль.
            System.out.println("Отправить сообщения следующим абонентам: ");

            //Долго мучался с этим методом нашел решение
            // в интернете




//            System.out.println("Отправить сообщения следующим абонентам: ");
//            for (String a : numbers){
//                System.out.println(a + " ");
//            }
//            System.out.println();
//            int[] sendFor = numbers;
//            System.out.println(numbers);
//            return sendFor;
            return Arrays.toString(numbers);
        }

        @Override
        public String toString() {//Переопределние типов в строку(toString)
            return "MobilPhone{" +
                    "number=" + number +
                    ", model='" + model + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }

}
