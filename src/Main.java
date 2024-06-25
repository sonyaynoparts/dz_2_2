public class Main {
    public static void main(String[] args) {
        double initialCheck = 100.25;
        double replenishmentAmount = 1100;
        int bonus;
        int MIN_SIZE_REPLENISHMENT = 1000;
        int RUBLES = 100;

        if (replenishmentAmount > MIN_SIZE_REPLENISHMENT) {
            bonus = (int) (replenishmentAmount / RUBLES);
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет:" + (initialCheck + replenishmentAmount + bonus));
        System.out.println("Количество бонусных рублей:" + bonus);
    }
}
