package flowerstore;

public abstract class Item {
    protected String description;
    public abstract double getPrice();

    public void setDescription(String descr) {
        this.description = descr;
    }
    public String getDescription() {
        return description;
    };
}