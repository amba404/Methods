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
        System.out.printf("Установите %sверсию приложения для %s по ссылке\n",
                clientDeviceYear <= tooOldPhone ? "облегченную " : "", getNameOs(clientOS)
        );
    }

    private static String getNameOs(int clientOS) {
        String result = switch (clientOS) {
            case 0 -> "iOS";
            case 1 -> "Android";
            default -> "unknown";
        };

        return result;
    }

    private static void printCheckLeapYear(int year) {

        if (isLeapYear(year)) {
            System.out.printf("%d год является високосным", year);
        } else {
            System.out.printf("%d год не является високосным", year);
        }

        System.out.println();
    }

    private static boolean isLeapYear(int year) {
        return (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    private static void printTaskTitle(int taskNumber) {

        System.out.printf("\n    Task %2d\n", taskNumber);
        System.out.println("---------------");

    }

}