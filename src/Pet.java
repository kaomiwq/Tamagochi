import java.util.Random;
import java.util.Scanner;

public class Pet {
    Random random = new Random();
    private int food;
    private int water;
    private int sleep;
    private int mood;
    private int health;
    private int hygiene;
    private boolean life = true;
    private int countActions;
    private int editNeed;
    private int sickRandomNumb;
    private int actionsLimit = 6;

    public Pet(int food, int water, int sleep, int mood, int health, int hygiene) {
        this.food = food;
        this.water = water;
        this.sleep = sleep;
        this.mood = mood;
        this.health = health;
        this.hygiene = hygiene;
        this.life = true;
    }


    public void increaseCountActions() {
        countActions++;
    }


    public void nextDayCheck() {
        if (life = true) {
            if (countActions == 5) {

                countActions = 0;

                food -= random.nextInt(35);
                water -= random.nextInt(35);
                sleep -= random.nextInt(35);
                mood -= random.nextInt(35);
                health -= random.nextInt(35);
                hygiene -= random.nextInt(35);

                sickRandomNumb = random.nextInt(101);
                actionsLimit = 6;

            }
        }
    }

    public void showNextDayNotification() {
        if (countActions==5) {
            System.out.println("Новый день начался!");
        }
    }

    public void showActionsLimitOutput() {
        if (life = true) {
            actionsLimit--;
            System.out.println();
            System.out.println("Колличество доступных действий : " + actionsLimit);
        }
    }

    public boolean isLife() {
        return life;
    }

    public void showNeedIncreased(String msg) {
        System.out.println(msg + " увеличена на " + editNeed);
        System.out.println();
    }

    public void increaseFood() {
        editNeed = random.nextInt(26);
        food += editNeed;
        countActions++;

    }


    public void increaseWater() {
        editNeed = random.nextInt(26);
        water += editNeed;
        countActions++;

    }

    public void increaseSleep() {
        editNeed = random.nextInt(26);
        sleep += editNeed;
        countActions++;

    }

    public void getSick() {
        sickRandomNumb = random.nextInt(101);
        if (countActions > 1) {
            if (sickRandomNumb > 80) {
                health -= 10;
                System.out.println("Ваш питомец заболел.");
            }
        }
    }

    public void increaseHealth() {
        editNeed = random.nextInt(26);
        health += editNeed;
        countActions++;

    }

    public void increaseMood() {
        editNeed = random.nextInt(26);
        mood += editNeed;
        countActions++;
    }

    public void increaseHygiene() {
        editNeed = random.nextInt(26);
        hygiene += editNeed;
        countActions++;
    }

    public void checkLifeStatus() {
        if (food > 100) {
            life = false;
            System.out.println("Поздравляю! Ваш питомец умер от переедания.");
            System.out.println("\t\t\tИГРА ЗАКОНЧЕНА!");
        } else {
            if (food < 0) {
                life = false;
                System.out.println("Поздравляю! Ваш питомец умер от голода.");
                System.out.println("\t\t\tИГРА ЗАКОНЧЕНА!");
            }
        }
        if (water > 100) {
            life = false;
            System.out.println("Поздравляю! Ваш питомец умер от гипергидратации.");
            System.out.println("\t\t\tИГРА ЗАКОНЧЕНА!");

        } else {
            if (water < 0) {
                life = false;
                System.out.println("Поздравляю! Ваш питомец умер от жажды.");
                System.out.println("\t\t\tИГРА ЗАКОНЧЕНА!");
            }
        }
        if (sleep > 100) {
            System.out.println("Ваш питомец не хочет спать.");
            sleep = 100;
            countActions--;
            actionsLimit++;
        } else {
            if (sleep < 0) {
                life = false;
                System.out.println("Поздравляю! Ваш питомец умер от недосыпа.");
                System.out.println("\t\t\tИГРА ЗАКОНЧЕНА!");
            }
        }
        if (health > 100) {
            life = false;
            System.out.println("Поздравляю! Ваш питомец стал бодибилдером и покинул дом.");
            System.out.println("\t\t\tИГРА ЗАКОНЧЕНА!");
        } else {
            if (health < 0) {
                life = false;
                System.out.println("Поздравляю! Вы очень внимательный хозяин! Ваш питомец умер от белзни.");
                System.out.println("\t\t\tИГРА ЗАКОНЧЕНА!");
            }
        }
        if (hygiene > 100) {
            System.out.println("Ваш питомец чист.");
            hygiene = 100;
            countActions--;
            actionsLimit++;
        } else {
            if (hygiene < 0) {
                life = false;
                System.out.println("Ваш питомец был слишком грязным, понимая это, при виде дождя он решил выпрыгнуть в окно и разбился.");
                System.out.println("\t\t\tИГРА ЗАКОНЧЕНА!");
            }
        }
        if (mood > 100) {
            System.out.println("Ваш питомец не хочет играть.");
            mood = 100;
            countActions--;
            actionsLimit++;
        } else {
            if (mood < 0) {
                life = false;
                System.out.println("Ващ питомец был недоволен тем, что вы с ним не играли и покинул дом.");
                System.out.println("\t\t\tИГРА ЗАКОНЧЕНА!");
            }
        }

    }

    public void printPetNeeds() {
        System.out.println("ЕДА: " + food + "\t\t\tВОДА: " + water + "\t\tБОДРОСТЬ: " + sleep);
        System.out.println("ГИГИЕНА: " + hygiene + "\t\tЗДОРОВЬЕ: " + health + "\tНАСТРОЕНИЕ: " + mood);
    }

}

