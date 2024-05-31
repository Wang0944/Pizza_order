package deliverabletest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import pizza.fooditems.*;
import pizza.services.*;

/**
 * Test our deliverable interface and inheritance heirarchy for the pizza shop
 * app.
 */
public class DeliverableTest {
	final static boolean THIN_CRUST = true;

	/**
	 * Main entry point for testing aspects of our pizza shop app.
	 * @param args command line arguments
	 * @author Yuchen Wang
	 */
	public static void main(String[] args) {

		/*
		 * 	Setup some toppings for pizza's
		 * 		onion, cheese, double cheese, pepperoni, ham, olive and green pepper
		 */
		Onion onion = new Onion("Onion");
		onion.setPricePerUnit(2.0);
		onion.setQuantity(1);
		onion.setUnitsOfMeasure("1/2 CUP");;

		Cheese cheese = new Cheese("Cheese");
		cheese.setPricePerUnit(2.75);
		cheese.setQuantity(1);
		cheese.setUnitsOfMeasure("1/2 CUP");;

		Cheese dblCheese = new Cheese("Double Cheese");
		dblCheese.setPricePerUnit(2.75);
		dblCheese.setQuantity(2);
		dblCheese.setUnitsOfMeasure("CUP");;

		Pepperoni pepperoni = new Pepperoni("Pepperoni");
		pepperoni.setPricePerUnit(3.75);
		pepperoni.setQuantity(1);
		pepperoni.setUnitsOfMeasure("CUP");;

		Ham ham = new Ham("Ham");
		ham.setPricePerUnit(2.75);
		ham.setQuantity(2);
		ham.setUnitsOfMeasure("CUP");;

		Olive olive = new Olive("Olive");
		olive.setPricePerUnit(1.75);
		olive.setQuantity(1);
		olive.setUnitsOfMeasure("CUP");;

		GreenPepper greenPepper = new GreenPepper("GreenPepper");
		greenPepper.setPricePerUnit(2.80);
		greenPepper.setQuantity(1);
		greenPepper.setUnitsOfMeasure("CUP");;

		/* Create our pizza orders				*/
		Pizza pizzaPesto = new Pizza(12, "pesto");
		pizzaPesto.setBasePrice(25.00);
		pizzaPesto.setThinCrust(Pizza.THIN_CRUST);
		pizzaPesto.addTopping(dblCheese);
		pizzaPesto.addTopping(pepperoni);
		pizzaPesto.addTopping(ham);
		pizzaPesto.addTopping(greenPepper);

		Pizza pizzaMarinara = new Pizza(14, "marinara");
		pizzaMarinara.setBasePrice(35.25);
		pizzaMarinara.setThinCrust(Pizza.THIN_CRUST);
		pizzaMarinara.addTopping(onion);
		pizzaMarinara.addTopping(ham);
		pizzaMarinara.addTopping(cheese);
		pizzaMarinara.addTopping(olive);
		
//		ArrayList<Deliverable> deliverableItems = new ArrayList<>();
//		deliverableItems.add(pizzaPesto);
//		deliverableItems.add(pizzaMarinara);
//		deliverableItems.add(new SudsOrder("Rollicking Root Beer", 6, 473));
//		deliverableItems.add(new SudsOrder("Super Citrus Fizz", 4, 473));
//		
		List<Deliverable> deliverableItems = new LinkedList<>();
		deliverableItems.add(pizzaPesto);
		deliverableItems.add(pizzaMarinara);
		deliverableItems.add(new SudsOrder("Rollicking Root Beer", 6, 473));
		deliverableItems.add(new SudsOrder("Super Citrus Fizz", 4, 473));

		int pizzaCount = 0;

		/*	TODO:	print the table of delivery costs that copies the provided sample output			*/
		System.out.println("Item-Sauce                            #/Size       Cost");
		Iterator<Deliverable> deliverIterator = deliverableItems.iterator();
        while(deliverIterator.hasNext()) {
        	Deliverable item = deliverIterator.next();
            if (item instanceof Pizza) {
                pizzaCount++;
                Pizza pizza = (Pizza) item;
                double totalCost = pizza.totalPrice();
                System.out.printf("Pizza %d-%-34s%d      %.2f - Delivery ( %10.2f) Total->>>$%10.2f\n",
                        pizzaCount, pizza.getTypeOfSauce(), pizza.sizeInInches(), pizza.getBasePrice(),
                        pizza.deliveryCost(), totalCost);
                
                ArrayList<FoodItem> toppings = pizza.getToppings(); 
                for (Iterator<FoodItem> iterator =  toppings.iterator();iterator.hasNext();){
                	FoodItem foodsItem = iterator.next();
                    if (foodsItem != null) {
                        System.out.printf("      - %-40s  %.2f\n", foodsItem.getName(),foodsItem.price() );
                    }
                }
            } else if (item instanceof SudsOrder) {
                SudsOrder sudsOrder = (SudsOrder) item;
                System.out.printf("%-40s  %d       %.2f\n", sudsOrder.getName(), sudsOrder.getNumber(),
                        sudsOrder.getNumber() * 0.75);
            }
        }
	}
	

}
