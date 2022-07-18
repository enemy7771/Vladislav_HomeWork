import sun.font.FontRunIterator;

/**Наследование Student, Aspirant
 * Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
 * Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
 * Создать переменную типа Student, которая ссылается на объект типа Aspirant.
 * Создать метод getStipendia() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100 у.е., иначе 80.
 * Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 200 у.е, иначе 180.
 * Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getSstipendia() для каждого элемента массива
 */


public class Task_08_5_Vladislav_Iuzhakov {
    public static void main(String[] args) {
        Student student = new Student("Vlad", "Iuzhakov", "5", 4);
        student.getStipendia();
        Student.Aspirant aspirant = new Student.Aspirant("HNJKF", "fsgb", "fmskl", 5, "fmmfslm");
        aspirant.getStipendiaForAspirant();


    }

}


class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    void getStipendia() {
        int i = 5;
        while (i == averageMark){
            System.out.println("Сумма стипенлии равна 100 у.е.");
            i++;
            break;
        }
        int j = 5;
        while (j > averageMark){
            System.out.println("Сумма стипендии равна 80 у.е.");
            j--;
            break;
        }


//        for (int i = 0; i == averageMark; i++) {
//            if (i == averageMark) {
//                System.out.println("Сумма стипенлии равна 100 у.е.");
//            }
//            else if (i < averageMark) {
//                System.out.println("Сумма стипендии равна 80 у.е.");
//                }
//
//        }
    }

    static class Aspirant extends Student {

        String scientificWork;

        public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
            super(firstName, lastName, group, averageMark);
            this.scientificWork = scientificWork;
        }
    }


        void getStipendiaForAspirant() {
            int i = 5;
            while (i == averageMark){
                System.out.println("Сумма стипенлии равна 200 у.е.");
                i++;
                break;
            }
            int j = 5;
            while (j > averageMark){
                System.out.println("Сумма стипендии равна 180 у.е.");
                j--;
                break;
            }
        }
}

