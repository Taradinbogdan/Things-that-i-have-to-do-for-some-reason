class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
class Cat {
    public String name;
    public int appetite;
    public boolean fulfillness;
    public Cat(String name, int appetite, boolean fulfillness) {
        this.name = name;
        this.appetite = appetite;
        this.fulfillness = fulfillness;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}
public class Main7 {
    public static void main(String[] args) {
        Cat[] cat = new Cat[4];
        cat[0] = new Cat("Barsik", 15, false);
        cat[1] = new Cat("Vasiliy", 20, false);
        cat[2] = new Cat("Sharick", 70, false);
        cat[3] = new Cat("Nafanya", 5, false);
        Plate plate = new Plate(100);
        plate.info();
        for(int i = 0; i < cat.length; i++) {
            if (cat[i].appetite > plate.food) {
                System.out.println("There is not enough food to beat " + cat[i].name + " appetite");
            } else {
                cat[i].eat(plate);
                System.out.println(cat[i].name + " had a bite");
                cat[i].fulfillness = true;
                plate.info();
            }
        }
        for(int o = 0; o < cat.length; o++) {
            if (cat[o].fulfillness == true) {
                System.out.println(cat[o].name + " if fulfilled");
            } else {
                System.out.println(cat[o].name + " if not fulfilled");
            }
        }
    }
}
