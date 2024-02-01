import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" \t\tВЫ ЗАПУСТИЛИ ТАМАГОЧИ ");

        System.out.println();

        Pet pet = new Pet(50, 50, 50, 50, 50, 50);

        while (pet.isLife()) {
            pet.printPetNeeds();
            Util.printMenu();
            pet.showActionsLimitOutput();


            int action = Util.inputInt("Выбирите действие: ",0,7);

            System.out.println();

            switch (action) {
                case 1: {
                    pet.increaseFood();
                    Util.screenClean();
                    pet.showNeedIncreased("Еда");
                    pet.showNextDayNotification();
                    pet.getSick();
                    pet.nextDayCheck();
                }
                break;
                case 2: {
                    pet.increaseWater();
                    Util.screenClean();
                    pet.showNeedIncreased("Вода");
                    pet.showNextDayNotification();
                    pet.getSick();
                    pet.nextDayCheck();
                }
                break;
                case 3: {
                    pet.increaseSleep();
                    Util.screenClean();
                    pet.showNeedIncreased("Бодрость");
                    pet.showNextDayNotification();
                    pet.getSick();
                    pet.nextDayCheck();
                }
                break;
                case 4: {
                    pet.increaseHygiene();
                    Util.screenClean();
                    pet.showNeedIncreased("Гигиена");
                    pet.showNextDayNotification();
                    pet.getSick();
                    pet.nextDayCheck();
                }
                break;
                case 5: {
                    pet.increaseHealth();
                    Util.screenClean();
                    pet.showNeedIncreased("Здоровье");
                    pet.showNextDayNotification();
                    pet.getSick();
                    pet.nextDayCheck();
                }
                break;
                case 6: {
                    pet.increaseMood();
                    Util.screenClean();
                    pet.showNeedIncreased("Настроение");
                    pet.showNextDayNotification();
                    pet.getSick();
                    pet.nextDayCheck();
                }
                break;
                case 7: {
                    pet.increaseCountActions();
                    pet.showNextDayNotification();
                    pet.getSick();
                    pet.nextDayCheck();
                }
                case 0: {
                    System.exit(0);
                }
                break;
            }
            pet.checkLifeStatus();
        }
    }
}