import Abstract.Products;
import Card.Card;
import Products.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //card
        Card card=new Card(new ArrayList<>());

        //hat
        Products hat=new Hat();
        hat.setPrice(45.75);
        //adding hat to the card
        card.addToCard(hat);

        //clothes
        Products clothes=new Clothes();
        clothes.setPrice(159.99);
        //adding clothes to the card
        card.addToCard(clothes);

        //shoe
        Products shoe=new Shoe();
        shoe.setPrice(1099.99);
        //adding shoe to the card
        card.addToCard(shoe);

        //getting total card price
        double total_price=card.getTotal_price();

        System.out.println("Total Card Price: "+total_price);



    }
}