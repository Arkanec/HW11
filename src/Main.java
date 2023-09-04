public class Main {
    public static void main(String[] args) {
        System.out.println(checkYear(2023));
        checkVersion(0, 2018);
        System.out.println(checkDay(17));
    }

    public static String checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 100 == 0) {
            return year + " високосный";
        } else {
            return year + " не високосный";
        }
    }

    public static void checkVersion(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
    }

    public static String checkDay(int distantion) {
        if (distantion < 20) {
            return "Потребуются сутки";
        }
        if (distantion >= 20 && distantion < 60) {
            return "Потребуется двое суток";
        }
        if (distantion >= 60 && distantion < 100) {
            return "Потребуется трое суток";
        } else {
            return "Доставка не осуществляется";
        }
    }
}