import java.time.LocalDate;


public class HomeWork6 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static boolean checkYear(int yearForCheck) {
        boolean isLeapYear = ((yearForCheck % 4 == 0) && (yearForCheck % 100 != 0) || (yearForCheck % 400 == 0));
        return isLeapYear;
    }

    public static void checkClientOsAndYear(int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 1 && clientDeviceYear > currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOs == 0 && clientDeviceYear > currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int calculationOfDeliveryDay(int deliveryDistance1) {
        int deliveryTime = 0;
        if (deliveryDistance1 <= 20) {
            deliveryTime += 1;
        } else if (deliveryDistance1 > 20 && deliveryDistance1 < 60) {
            deliveryTime += 2;
        }
        if (deliveryDistance1 >= 60 && deliveryDistance1 <= 100) {
            deliveryTime += 3;
        }
        return deliveryTime;
    }

    public static void task1() {
        System.out.println("Задание 1");
        int year1 = 2021;
        boolean isLeapYear1 = checkYear(year1);
        if (isLeapYear1) {
            System.out.println(year1 + " високосный год");
        } else {
            System.out.println(year1 + " не високосный год");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int clientOs = 0;
        int clientDeviceYear = 2015;
        checkClientOsAndYear(clientOs, clientDeviceYear);
    }

    public static void task3() {
        System.out.println("Задание 3");
        int deliveryDistance = 10;
        int deliveryDayOutput = calculationOfDeliveryDay(deliveryDistance);
        if (deliveryDayOutput == 0 || deliveryDayOutput > 3) {
            System.out.println("Доставка не осуществляется");
        } else {
            System.out.println("Потребуется дней: " + deliveryDayOutput);
        }
    }
}
