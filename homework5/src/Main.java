// Main.java
public class Main {
    public static void main(String[] args) {
        FruitStore fruitStore = new FruitStore("Fruit World", "Main Street");
        VegetableStore vegetableStore = new VegetableStore("Veggie Market", "Highway Road");
        MeatStore meatStore = new MeatStore("Meat Palace", "Downtown");

        fruitStore.displayItems();
        vegetableStore.displayItems();
        meatStore.displayItems();
    }
}