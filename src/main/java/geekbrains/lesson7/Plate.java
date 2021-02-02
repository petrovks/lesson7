package geekbrains.lesson7;

public class Plate {
    public int getFood() {
        return food;
    }

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void addFood(int f) {
        food += f;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}