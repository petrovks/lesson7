package geekbrains.lesson7;public class Main {
    public static void main(String[] args) {
            Cat[] cats = {new Cat("Baki", 5),
                    new Cat("Teddy", 7),
                    new Cat("Rizhik", 4),
                    new Cat("Bodya", 6)
            };

            Plate plate = new Plate(20);

            for (Cat c: cats) {
                c.eat(plate);
                if (!c.isHungry()) {
                System.out.println(c.getName() + " наелся!");
                }
                else System.out.println(c.getName() + " не хватило еды!");
        }
    }
}
