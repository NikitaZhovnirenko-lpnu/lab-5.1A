package com.company;

public class Goods {
    private double price;
    private int quantity;

    public Goods(double price, int quantity) {//конструктор з параметрами
        this.price = price;
        this.quantity = quantity;
    }

    public Goods(){} //пустий конструктор

    public Goods(Goods goods){ //конструктор копіювання
        this.price = goods.getPrice();
        this.quantity = getQuantity();
    }

    public void cost(Goods goods){
        System.out.println("Ціна товару: " + goods.getPrice() * goods.getQuantity());

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
        this.price = price;
        else {
                CommonErrors.printBasicError();
            System.exit(0);
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0)
        this.quantity = quantity;
        else {
            CommonErrors.printBasicError();
            System.exit(0);
        }
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
