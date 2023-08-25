package Toys;

abstract public class Toy {
    private TypeOfToy toyType;

    public Toy(TypeOfToy toyType) {
        this.toyType = toyType;
    }

    public TypeOfToy getToyType() {
        return toyType;
    }

    public void dellCount(){

    }
}
