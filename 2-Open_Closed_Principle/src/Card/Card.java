package Card;

import Abstract.Products;

import java.util.List;

public class Card {

    private double total_price;

    private List<Products> products;

    public Card(List<Products> products) {
        this.products = products;
    }

    public void addToCard(Products products){
        this.products.add(products);
        System.out.println("Product added to the card.");
    }

    private void setTotal_price(){
        for(Products products : products){
            total_price+=products.getPrice();
        }
    }

    public double getTotal_price() {
        setTotal_price();
        return total_price;
    }
}
