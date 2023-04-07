public class Grenade extends Weapon {

    private int numberOfFragments;

    public Grenade(String name, int weight, int numberOfFragments) {
        super(name, weight);
        this.numberOfFragments = numberOfFragments;
    }

    public int getNumberOfFragments() {
        return numberOfFragments;
    }

    @Override
    public void print() {
        System.out.println("Название гранаты: " + getName() + " Вес: " + getWeight() + "кг" +
                " Количество осколков внутри: " + numberOfFragments);
    }
}
