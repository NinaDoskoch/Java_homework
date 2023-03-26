// FruitStore.java
public class FruitStore extends GroceryStore {
    public FruitStore(String storeName, String location) {
        super(storeName, location);
    }

    @Override
    public void displayItems() {
        System.out.println("Displaying fruits available in " + getStoreName() + " located at " + getLocation());
    }
}