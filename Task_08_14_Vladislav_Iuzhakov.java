/**
 * ќдинаковые машины
 * ¬ далеком-далеком прошлом все машины называли одинаково. Ќо вот в один прекрасный день директору завода по
 * производству автомобилей надоело однообразие, и он выдал распор€жение: давать разные названи€ модел€м авто.
 * »так, как ты уже догадалс€, тво€ задача Ч помочь главному инженеру исправить программу по производству машин так,
 * чтобы каждому объекту-машине можно было присвоить уникальное им€.
 *
 * Requirements:
 * 1. ѕоле modelName класса Car должно быть не статическим.
 * 2. ƒолжны быть исправлены геттер и сеттер дл€ пол€ modelName.
 */

public class Task_08_14_Vladislav_Iuzhakov {
    public static void main(String[] args) {
        Cars cars = new Cars();
        cars.setModelName("BMW");
        System.out.println(cars.getModelName());
    }
}

class Cars {
    private String modelName;
    private int speed;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String newModelName) {
        modelName = newModelName;
//        Cars.modelName = modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
