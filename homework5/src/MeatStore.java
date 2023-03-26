// MeatStore.java
public final class MeatStore extends GroceryStore {
    public MeatStore(String storeName, String location) {
        super(storeName, location);
    }

    @Override
    public void displayItems() {
        System.out.println("Displaying meats available in " + getStoreName() + " located at " + getLocation());
    }
}
