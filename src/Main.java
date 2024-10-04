import java.util.Random;

public class Main {

    /*1. Создать возвращаемый метод с названием “permission”,
    который будет принимать 2 входящих параметра - возраст человека и
    температуру на улице, и возвращать результат в виде строки.*/
    public static String permission(int age, int temperature) {

        /*2. Алгоритм метода должен работать следующим образом:

        - если возраст человека от 20 до 45 лет и температура на улице от -20 до 30 градусов, то возвращаемый результат - “Можно идти гулять”;

        - если же человеку меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов, то результат снова -  “Можно идти гулять”;

        - а если человеку больше 45 лет, то результат “Можно идти гулять” формируется только тогда когда на улице температура в диапазоне от -10 до 25 градусов;

        - в остальных случаях метод должен возвращать результат - “Оставайтесь дома”;*/
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    /*4. Написать метод в котором генерируется случайный возраст
    public static int generateRandomAge(){........}*/
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100); // Возраст от 0 до 99
    }

    public static void main(String[] args) {
        /*3. В методе main вызвать написанный метод 5 раз с различными
        входными данными (аргументами) и распечатать результат в консоль.*/
        int randomAge = generateRandomAge();
        System.out.println("Возраст: " + randomAge + ", Температура: 10, Результат: " + permission(randomAge, 10));
        randomAge = generateRandomAge();
        System.out.println("Возраст: " + randomAge + ", Температура: 15, Результат: " + permission(randomAge, 15));
        randomAge = generateRandomAge();
        System.out.println("Возраст: " + randomAge + ", Температура: -5, Результат: " + permission(randomAge, -5));
        randomAge = generateRandomAge();
        System.out.println("Возраст: " + randomAge + ", Температура: 30, Результат: " + permission(randomAge, 30));
        randomAge = generateRandomAge();
        System.out.println("Возраст: " + randomAge + ", Температура: -20, Результат: " + permission(randomAge, -20));
        /*5. При вызове метода “permission”, который формирует результат “можно ли идти гулять” использовать генерирование случайного возраста с помощью метода “generateRandomAge”

        НАПРИМЕР: Было - permission(23, 10); Меняете на - permission(generateRandomAge(), 10);*/
    }
}
