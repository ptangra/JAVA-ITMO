package ru.billing.stocklist;

public class GenericItem {
    private int ID;
    private String name;
    private float price;
    private String productLike;
    private enum Category { FOOD, PRINT, DRESS, GENERAL }
    private GenericItem analog;
    private Category d = Category.GENERAL;
    private static int currentID;

    public int getID(){
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public GenericItem getAnalog() {
        return analog;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    public Category getCategory() {
        return d;
    }

    public void setCategory(Category d) {
        this.d = d;
    }

    public int getCurrentID() {
        return currentID;
    }

    public void setCurrentID(int currentID) {
        GenericItem.currentID = currentID;
    }

    public GenericItem(String name, float price, Category d){
        this.name = name;
        this.price = price;
        this.d = d;
        this.ID = GenericItem.currentID++;};
    public GenericItem(String name, float price, GenericItem analog){
        this.name = name;
        this.price=price;
        this.analog = analog;
        this.ID = GenericItem.currentID++;};
    public GenericItem(){this.ID = GenericItem.currentID++;};

    public void printAll(){
        System.out.printf("ID: %d, Name: %-10s , price:%5.2f \n , productLike: %-10s , Category: %-10s",ID,name,price,productLike,d);
    }
}