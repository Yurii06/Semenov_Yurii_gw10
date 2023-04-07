public class Main {
    public static void main(String[] args) {

                Printable gun = createObject("Gun");
                Printable knife = createObject("Knife");
                Printable grenade = createObject("Grenade");
                
                gun.print();
                System.out.println("------------------------");
                knife.print();
                System.out.println("------------------------");
                grenade.print();
            }

    public static Printable createObject(String className) {
        switch (className) {
            case "Gun":
                Gun gun = new Gun("Colt M1911",3,7,"A1");
                return gun;
            case "Knife":
                Knife knife = new Knife("Benchmade 940-2",1,15,"CPM-S30V Steel");
                return knife;
            case "Grenade":
                Grenade grenade = new Grenade("M67 Fragmentation Grenade",2,500);
                return grenade;
            default:
                return null;
        }
    }
}