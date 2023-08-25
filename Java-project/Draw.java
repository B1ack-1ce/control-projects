import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import Toys.Toy;

public class Draw {
    private LinkedList<Toy> prizePool;

    public Draw() {
        this.prizePool = new LinkedList<Toy>();
    }

    public void addToyInPrizeList(Toy toy) {
        if(toy == null){
            System.out.println("Список пуст");
        } else {
            prizePool.add(toy);
        }
    }

    public void getPrizeToy() {
        if (prizePool.size() == 0){
            System.out.println("\nПризовой список пуст!\n");
            return;
        }

        Toy prize = prizePool.removeFirst();
        try {
            File file = new File("Java-project\\prizeList.txt"); // Путь конкретно моего расположения директории

            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            String res = String.format("%s", prize.getClass().getSimpleName());

            bw.write(res);
            bw.newLine();
            bw.close();
            System.out.println("\n\nВыдача игрушки прошла успешно");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void printInfo() {
        if (prizePool.size() == 0)
            System.out.println("Призовой список пуст.\nПроведите розыгрыш\n");
        else {
            System.out.println("Тип призовой игрушки:\n");
            for (Toy toy : prizePool) {
                System.out.print(toy.getToyType() + "\t");
            }
            System.out.println();
        }
    }
}
