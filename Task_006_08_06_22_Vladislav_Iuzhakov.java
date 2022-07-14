import java.util.Scanner;
/**
 * [08.06.2022 19:59]
 * Написать три метода, первый умеет считывать с клавиатуры любую строку.
 * Второй метод способен развернуть любую строку зеркально (используем цикл и toCharArray от String).
 * Все методы должны вызываться в методе main (напоминаю методы, которые вызываются не на объекте, а из класса,
 * где создан main, необходимо, чтобы они были static или создавайте отдельный класс с методами и на объекте вызывайте
 * все три метода в main. Третий метод выводит любую строку на экран. Оба варианта помогут вам лучше познать принципы
 * создания и вызовы методов и объектов. StringBuilder.revers пользоваться нельзя!
 */

public class Task_006_08_06_22_Vladislav_Iuzhakov {
    public static void main(String[] args) {
        String string = stringScanner(String.valueOf(System.in));//Считываем строку
        String str = stringReverse(string);//Делаем реверс строки
        stringOut(str);//Выводим строку




    }

    //Метод который позволяет нам считывать с клавиатуры любую строку
    public static String stringScanner(String str){
        Scanner scanner = new Scanner(System.in);//Создаём обьект класса Scanner
        str = scanner.nextLine();//считываем строку
        scanner.close();// закрываем scanner
        return str;// возвращаем полученную строку
    }

    //Метод при помощи которого будем разворачивать строку
    public static String stringReverse(String str) {//Создаём метод и передаём в параметры переменную String и называем её str
        char[] array = str.toCharArray();// Перевожу строку в массив символов методом toCharArray
        String result = "";
        for (int i = 0; i < array.length; i++) {//Цикл for берущий символы послеовательно от конца строки до её начала
            result = array[i] + result;//Передаём перевёрнутый массив в result
        }
        return result;//Возвращаем результат
    }

    //Метод который выводит любую строку на экран
    public static String stringOut(String s){//Создаём метод и передаём в параметры переменную String и называем её s
        System.out.println(s);//Передаём в System.out.println нашу переменную s
        return s;//Возвращаем наше значение
    }

    }




