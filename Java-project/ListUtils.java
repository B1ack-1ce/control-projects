import java.util.ArrayList;
import java.util.Random;

import Toys.Doll;
import Toys.Lego;
import Toys.Robot;
import Toys.Toy;

public class ListUtils {
    public static ArrayList<Toy> createNewToyList(int count) {
        Random random = new Random();
        ArrayList<Toy> toys = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            switch (random.nextInt(1, 4)) {
                case 1 -> toys.add(new Robot());
                case 2 -> toys.add(new Doll());
                case 3 -> toys.add(new Lego());
                default -> {
                }
            }
        }
        dropChance();
        return toys;
    }

    public static void addNewToy(ArrayList<Toy> list) {
        switch (new Random().nextInt(1, 4)) {
            case 1 -> list.add(new Robot());
            case 2 -> list.add(new Doll());
            case 3 -> list.add(new Lego());
            default -> {
            }
        }
        dropChance();
    }

    private static void dropChance(){
        float chance = 100f / (Robot.getCount() + Doll.getCount() + Lego.getCount());
        Robot.setDporPercentage(chance * Robot.getCount());
        Doll.setDporPercentage(chance * Doll.getCount());
        Lego.setDporPercentage(chance * Lego.getCount());
    }

    public static void printInfo() {
        System.out.printf("Количество роботов: %d. Процент выпадения: %f\n", Robot.getCount(),
                Robot.getDropPercentage());
        System.out.printf("Количество кукл: %d. Процент выпадения: %f\n", Doll.getCount(), Doll.getDropPercentage());
        System.out.printf("Количество конструкторов: %d. Процент выпадения: %f\n", Lego.getCount(),
                Lego.getDropPercentage());
        System.out.println();
    }

    
}
