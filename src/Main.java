public class Main {
    public static void main(String[] args) {

        // Task 1
        printTaskTitle(1);

        int year = 2021;
        printCheckLeapYear(year);

        // Task 2
        printTaskTitle(2);

        int clientOS = 0; // 0: iOS, 1: Android
        int clientDeviceYear = 2015;

        printClientPhoneMessage(clientOS, clientDeviceYear);

        // Task 3
        printTaskTitle(3);

        int deliveryDistance = 95;

        int deliveryDays = getDeliveryDays(deliveryDistance);

        if (deliveryDays > 0)
            System.out.println("Потребуется дней: " + deliveryDays);
        else
            System.out.println("Доставки нет");


    }

    private static int getDeliveryDays(int deliveryDistance) {

        int deliveryDays;

        if (deliveryDistance > 100) {
            deliveryDays = 0;
        } else {
            deliveryDays = 1;

            if (deliveryDistance > 20) {
                deliveryDays += 1;
            }

            if (deliveryDistance > 60) {
                deliveryDays += 1;
            }
        }

        return deliveryDays;
    }

    private static void printClientPhoneMessage(int clientOS, int clientDeviceYear) {
        int tooOldPhone = 2015;
        switch (clientOS) {
            case 0:
                System.out.printf("Установите %sверсию приложения для iOS по ссылке\n",
                        clientDeviceYear <= tooOldPhone ? "облегченную " : "");
                break;
            case 1:
                System.out.printf("Установите %sверсию приложения для Android по ссылке\n",
                        clientDeviceYear <= tooOldPhone ? "облегченную " : "");
                break;
        }
    }

    private static void printCheckLeapYear(int year) {

        boolean isLeapYear;

        if (year < 1584) {
            isLeapYear = false;
        } else if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
            isLeapYear = false;
        } else isLeapYear = year % 4 == 0;

        if (isLeapYear) {
            System.out.printf("%d год является високосным", year);
        } else {
            System.out.printf("%d год не является високосным", year);
        }

        System.out.println();
    }

    private static void printTaskTitle(int taskNumber) {

        System.out.printf("\n    Task %2d\n", taskNumber);
        System.out.println("---------------");

    }

}