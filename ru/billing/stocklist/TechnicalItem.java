package ru.billing.stocklist;

public class TechnicalItem extends GenericItem{
    //public TechnicalItem(){};
    private short warrantyTime;
    // public TechnicalItem(int ID,String name, float price, String productLike, short warrantyTime){
    //     this.ID = ID;
    //     this.name = name;
    //     this.price = price;
    //     this.productLike = productLike;
    //     this.warrantyTime = warrantyTime;
    // }
   
    public void printAll(){
        System.out.printf("ID: %d, Name: %-10s , price:%5.2f \n , productLike: %-10s , Category: %-10s ,  Warranty Time: %d",getID(), getName(), getPrice(), getCategory(),warrantyTime);
    }
    public short getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

}