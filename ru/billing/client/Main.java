package ru.billing.client;
import ru.billing.stocklist.*;

import java.util.Date;


public class Main{
    public static void main(String[] args) {
    GenericItem a = new GenericItem();
    a.setID(1);
    a.setName("Tom");
    a.setPrice(3);
    a.printAll();
    GenericItem b = new GenericItem();
    b.setID(2);
    b.setName("Jerry");
    b.setPrice(5); 
    b.setAnalog(a);
    b.printAll();
    GenericItem c = new GenericItem();
    c.setID(3);
    c.setName("Dogh");
    c.setPrice(8);
    c.setAnalog(b); 
    c.printAll();

    FoodItem f1 = new FoodItem("Alo");
    FoodItem f2 = new FoodItem("Bread", 25, (short)30);
    // FoodItem f = new FoodItem();
    // f.ID = 4;
    // Date date = new Date();
    // f.dateOfIncome =  date;
    // f.expires = 20;
    // f.printAll();

    TechnicalItem g = new TechnicalItem();
    g.setID(5);
    g.setWarrantyTime((short)50);
    g.printAll();
    
    // TechnicalItem[] g = new TechnicalItem[6];
    // g[0] = new TechnicalItem(1);

    String line = new String("Конфеты ’Маска’;45;120");
    String[] item_fId = line.split(";");

        FoodItem foodItem = new FoodItem(item_fId[0], Float.parseFloat(item_fId[1]), Short.parseShort(item_fId[2]));
        foodItem.printAll();
    

        // LAB 4 
    ItemCatalog h = new ItemCatalog();
    h.addItem(a);
    h.addItem(b);
    h.addItem(c);
    h.addItem(f1);
    h.addItem(f2);
    h.addItem(g);

    long begin = new Date().getTime();
    for(int i=0; i<100000;i++)
        h.findItemByID(1);
    long end = new Date().getTime();
    System.out.println("In HashMap: "+(end-begin)); 
    
    begin = new Date().getTime();
    for(int i=0; i<100000;i++)
        h.findItemByIDAL(1);
    end = new Date().getTime();
    System.out.println("In ArrayList: "+(end-begin));

    CatalogLoader loader = new CatalogStubLoader();
        loader.load(h);
        h.printItems();
  }
}