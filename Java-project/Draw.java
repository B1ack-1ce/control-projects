import java.util.ArrayList;
import java.util.LinkedList;

import Toys.Toy;
import Toys.TypeOfToy;

public class Draw {
     private LinkedList<Toy> prizePool;

    public Draw() {
        this.prizePool = new LinkedList<Toy>();
    }

    public static Toy findToy(ArrayList<Toy> list) {
        Toy toy = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getToyType() == TypeOfToy.Doll) {
                toy = list.get(i);
                list.get(i).dellCount();
                list.remove(toy);
                return toy;
            }
        }
        return toy;
    }

    public void addToyInPrizeList(Toy toy){
        prizePool.add(toy);
    }

    public void printInfo(){
        if(prizePool.size() == 0)
            System.out.println("Призовой список пуст.\nПроведите розыгрыш\n");
        else{
            System.out.println("Тип призовой игрушки:\n");
            for (Toy toy: prizePool) {
                System.out.println(toy.getToyType() + "\n");
            }
        }
    }
}
