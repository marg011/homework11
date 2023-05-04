public class Main {

    public static boolean checkLeapYear(int year){
        boolean leapYear = false;
        if (year % 400 == 0){
            leapYear = true;
        } else if (year % 4  == 0 && year % 100 != 0){
            leapYear =true;
        }
        return leapYear;
    }

    public static String checkOs(int os) {
        String system = "iOS";
        if (os == 1) {
            system = "Android";
        }
        return system;
    }
    public static String checkVersion(int year){
        int currentYear = 2023;
        String version= "normal";
        if (currentYear < year){
            version = "light";
        }
        return version;
    }

    public static String calculateDeliveryDays(int distance){
        String days;
        if (distance <= 20){
            days = "1";
        } else if (distance > 20 && distance <= 60){
            days = "2";
        } else if (distance > 60 && distance <= 100){
            days = "3";
        } else days = "No delivery";
        return days;

    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int year = 2100;
        if (checkLeapYear(year) == true){
            System.out.println(year + " is a leap year");
        } else System.out.println(year + " is not a leap year");

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int year = 2024;
        int os = 1;
        System.out.println("Please install " + checkVersion(year) + " version of the app for " + checkOs(os));

    }

    public static void task3 () {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        System.out.println("Days for delivery: " + calculateDeliveryDays(deliveryDistance));

    }
}