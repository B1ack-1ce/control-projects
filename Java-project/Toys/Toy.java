package Toys;

abstract public class Toy {
    private int id;
    private TypeOfToy toyType;

    public Toy(int id, TypeOfToy toyType) {
        this.id = id;
        this.toyType = toyType;
    }

    public void printInfo(){
        System.out.printf("Название : %s",getClass());
    }

    public TypeOfToy getToyType() {
        return toyType;
    }
    public void dellCount(){

    }
}
