//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание N1");

        int clientOS =0;
        switch (clientOS) {
        case 0:
        System.out.println("Установите версию приложения для iOS по ссылке.");
        break;
        case 1:
        System.out.println("Установите версию приложения для Android по ссылке.");
        break;
        }

        System.out.println("");
        System.out.println("Задание N2");

        int clientDeviceYear = 2015;
        boolean isVersionIos = false;

        if (clientDeviceYear < 2015 && isVersionIos == true) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear >= 2015 && isVersionIos == true) {
          System.out.println("Установите версию приложения для iOS по ссылке.");
        }  else if (clientDeviceYear < 2015 && isVersionIos == false) {
           System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println("");
        System.out.println("Задание N3");

        int year = 2023;

        if (year < 1584) {
            System.out.println("До 1584 года понятия високосного года не существовало.");
        }
        else if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный.");
        }
        else {
            System.out.println(year + " год не високосный.");
        }

        System.out.println("");
        System.out.println("Задание N4");

        int deliveryDistance = 190;
        int minTimePeriod = 1;
        int timePeriod =1;
        if (deliveryDistance <= 19) {
            System.out.println("Доставка Вашей карты будет в течении " + minTimePeriod + " суток.");
        }
        else if (deliveryDistance >= 20 && deliveryDistance <= 59) {
            timePeriod = minTimePeriod + 1;
            System.out.println("Доставка Вашей карты будет в течении " + timePeriod + " суток.");
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 99) {
            timePeriod = minTimePeriod + 2;
            System.out.println("Доставка Вашей карты будет в течении " + timePeriod + " суток.");
        }
        else if (deliveryDistance >= 100) {
            System.out.println("Доставка карты не может быть выполнена на такое расстояние. ");
        }

        System.out.println("");
        System.out.println("Задание N5");

        int monthNumber = 11;

                switch (monthNumber) {
                case 12, 1, 2:
                    System.out.println("Сейчас зима.");
                    break;
                case 3, 4, 5:
                    System.out.println("Сейчас весна.");
                    break;
                case 6, 7, 8:
                    System.out.println("Сейчас лето.");
                    break;
                case 9, 10, 11:
                    System.out.println("Сейчас осень.");
                    break;
                    default:
                        System.out.println("Некорректный ввод номера месяца.");

        }
        }
}