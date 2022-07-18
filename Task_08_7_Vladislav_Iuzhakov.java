/**Магазин.
 Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 Создать класс Basket, содержащий массив купленных товаров.
 Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.
 */


public class Task_08_7_Vladislav_Iuzhakov {
    public static void main(String[] args) {
        Category category1 = new Category();
        Category category2 = new Category();
        Category category3 = new Category();
        User user = new User();
    }
}


class Product{
    String name;
    int price;
    byte rating;

    public Product(String name, int price, byte rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}

class Category{
    String name;
    Product[] arrayProduct;

    public Category(String name, Product[] arrayProduct) {
        this.name = name;
        this.arrayProduct = arrayProduct;
    }
}

class Basket{
    Product[] arrayPurchased;

    public Basket(Product[] arrayPurchased) {
        this.arrayPurchased = arrayPurchased;
    }
}

class User{
    String login;
    int Password;
    Basket basket = new Basket();

    public User(String login, int password, Basket basket) {
        this.login = login;
        Password = password;
        this.basket = basket;
    }
}