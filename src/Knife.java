public class Knife extends Weapon {

    private int length;
    private String material;


    public Knife(String name, int weight, int length, String material) {
        super(name, weight);
        this.length = length;
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void print() {
        System.out.println("Название ножа: " + getName() + " Вес: " + getWeight() + "кг" +
                " Длинна: " + length + "см" + " Материал: " + material);
    }
}
