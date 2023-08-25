package Toys;

public class Doll extends Toy {
    private static int count;
    private static double dropProcent;

    public Doll() {
        super(TypeOfToy.Doll);
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
}
