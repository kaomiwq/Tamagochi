import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" \t\tВЫ ЗАПУСТИЛИ ТАМАГОЧИ ");

        System.out.println();

        Pet pet = new Pet(50, 50, 50, 50, 50, 50);

        while (pet.isLife()) {
            pet.showNextDayNotification();
            pet.printPetNeeds();
            pet.printMenu();
            pet.showActionsLimitOutput();


            int action = pet.inputInt("Выбирите действие: ", 0, 7);

            System.out.println();

            switch (action) {
                case 1: {
                    pet.setFoodBorders();
                    pet.screenClean();
                    pet.showNeedIncreased("Еда");
                    pet.nextDayCheck();
                }
                break;
                case 2: {
                    pet.setWaterBorders();
                    pet.screenClean();
                    pet.showNeedIncreased("Вода");
                    pet.nextDayCheck();
                }
                break;
                case 3: {
                    pet.setSleepBorders();
                    pet.screenClean();
                    pet.showNeedIncreased("Бодрость");
                    pet.nextDayCheck();
                }
                break;
                case 4: {
                    pet.setHygieneBorders();
                    pet.screenClean();
                    pet.showNeedIncreased("Гигиена");
                    pet.nextDayCheck();
                }
                break;
                case 5: {
                    pet.setHealthBorders();
                    pet.screenClean();
                    pet.showNeedIncreased("Здоровье");
                    pet.nextDayCheck();
                }
                break;
                case 6: {
                    pet.setMoodBorders();
                    pet.screenClean();
                    pet.showNeedIncreased("Настроение");
                    pet.nextDayCheck();
                }
                break;
                case 7: {
                    pet.increaseCountActions();
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