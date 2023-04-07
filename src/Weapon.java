public abstract class Weapon implements Printable{

   public String name;
   public int weight;

    public Weapon(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
