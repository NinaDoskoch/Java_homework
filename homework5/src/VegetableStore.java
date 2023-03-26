// VegetableStore.java
public class VegetableStore extends GroceryStore {
    public VegetableStore(String storeName, String location) {
        super(storeName, location);
    }

    @Override
    public void displayItems() {
        System.out.println("Displaying vegetables available in " + getStoreName() + " located at " + getLocation());
    }
}