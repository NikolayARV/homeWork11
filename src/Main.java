import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        determineLeapYear(2019);
        determineOSVersion(0, 2021);
        determineDeliveryDays(140);
    }

    // Задача 1
    public static void determineLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    //Задача 2
    public static void determineOSVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    // Задача 3
    public static void determineDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays = deliveryDays + 1;
        }
        if (deliveryDistance >= 60) {
            deliveryDays = (deliveryDistance + 60) / 40;
        }
        System.out.println("Потребуется " + deliveryDays + " дней доставки.");
    }


}