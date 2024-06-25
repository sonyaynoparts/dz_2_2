public class Main {
    public static void main(String[] args) {
        double InitialCheck = 100.25;
        double ReplenishmentAmount = 1100;
        int bonus;
        int MIN_SIZE_REPLENISHMENT = 1000;
        int RUBLES = 100;

        if (ReplenishmentAmount > MIN_SIZE_REPLENISHMENT) {
            bonus = (int) (ReplenishmentAmount / RUBLES);
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет:" + (InitialCheck + ReplenishmentAmount + bonus));
        System.out.println("Количество бонусных рублей:" + bonus);
    }
}
