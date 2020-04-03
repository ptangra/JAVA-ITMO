package ru.billing.stocklist;
import java.util.Date;

public class FoodItem extends GenericItem{
    private  Date dateOfIncome;
    private short expires;
    
    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    public short getExpires() {
        return expires;
    }

    public void setExpires(short expires) {
        this.expires = expires;
    }
    public FoodItem(String name, float price, FoodItem analog, Date date, short expires){
        this.setName(name);
        this.setPrice(price);
        this.setAnalog(analog);
        this.dateOfIncome = date;
        this.expires = expires;
    }
    public FoodItem(String name, float price, short expires){
        this(name, price, null, null, expires);
    }
    public FoodItem(String name){
        this(name, 0.00f, null, null, (short)0);
    }
    public void printAll(){
        System.out.printf("ID: %d, Name: %-10s , price:%5.2f \n , productLike: %-10s , Category: %-10s , Date of Income: %-10s , Date of expire: %d",getID(), getName(), getPrice(), getCategory(),dateOfIncome, expires);
    }
}