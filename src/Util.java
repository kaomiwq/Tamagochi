import java.util.Scanner;

public class Util {
    public static void screenClean() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }
    public static void printMenu() {
        System.out.println("-".repeat(68));
        System.out.println("1. Покормить" + "\t2. Попоить" + "\t\t3. Уложить спать" + "\t4. Помыть");
        System.out.println("5. Полечить" + "\t\t6. Поиграть" + "\t\t7. Ждать" + "\t\t\t0. Выйти из игры");

    }
    public static int inputInt(String message, int min, int max) {
        boolean isValidInput;
        int output = 0;
        do {
            try {
                isValidInput = true;
                Scanner scanner = new Scanner(System.in);

                System.out.print(message);
                output = scanner.nextInt();

                if (output < min || output > max) {
                    System.out.println("Ошибка ввода. Вы вышли за границы диапазона от " + min + " до " + max);
                    throw new Exception();
                }

            } catch (Exception e) {
                isValidInput = false;
                System.out.println("Ошибка ввода. Пожалуйста повторите ввод");
            }

        } while (isValidInput == false);

        return output;
    }
}
