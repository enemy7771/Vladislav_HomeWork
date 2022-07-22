/**
 * ���������� ������
 * � �������-������� ������� ��� ������ �������� ���������. �� ��� � ���� ���������� ���� ��������� ������ ��
 * ������������ ����������� ������� �����������, � �� ����� ������������: ������ ������ �������� ������� ����.
 * ����, ��� �� ��� ���������, ���� ������ � ������ �������� �������� ��������� ��������� �� ������������ ����� ���,
 * ����� ������� �������-������ ����� ���� ��������� ���������� ���.
 *
 * Requirements:
 * 1. ���� modelName ������ Car ������ ���� �� �����������.
 * 2. ������ ���� ���������� ������ � ������ ��� ���� modelName.
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
