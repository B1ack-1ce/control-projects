package Toys;

public class Lego extends Toy {
    private static int count;
    private static double dropProcent;

    public Lego() {
        super(2, TypeOfToy.Lego);
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static double getDropPercentage() {
        return dropProcent;
    }

    public static void setDporPercentage(double percent){
        dropProcent = Math.floor(percent);
    }

    @Override
    public void dellCount() {
        count--;
    }


    @Override
    public void printInfo() {
        System.out.printf("\nНазвание : %s, Количество : %d, Процент выпадeния : %d", TypeOfToy.Lego, count, dropProcent);
    }
}
