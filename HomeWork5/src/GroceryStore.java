// GroceryStore.java
public abstract class GroceryStore {
    private String storeName;
    private String location;

    public GroceryStore(String storeName, String location) {
        this.storeName = storeName;
        this.location = location;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public abstract void displayItems();
}








