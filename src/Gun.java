public class Gun extends Weapon{

private int numberOfRounds;
private String model;

    public Gun(String name, int weight, int numberOfRounds, String model) {
        super(name, weight);
        this.numberOfRounds = numberOfRounds;
        this.model = model;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void print() {
        System.out.println("Название пистолета: " + getName() + " Вес: " + getWeight() + "кг" +
                " Количество патронов в обойме: " + numberOfRounds + " Название модели: " + model);
    }
}
