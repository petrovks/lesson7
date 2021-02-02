package geekbrains.lesson7;

public class Cat {


    private String name;
    private int appetite;


    private boolean hungry;

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        hungry = true;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            hungry = false;

        }

    }



}