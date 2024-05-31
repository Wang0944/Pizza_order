package pizza.services;

import java.util.ArrayList;

import pizza.fooditems.FoodItem;

/**
 * The Pizza class represents a pizza object. It implements the Deliverable interface.
 */
public class Pizza implements Deliverable{
	public static final boolean THIN_CRUST=true;
	private int sizeInInches;
	private String typeOfSauce;
	private boolean thinCrust;
	private ArrayList<FoodItem> topPings;
	private int topPingCount;
	private double basePrice;
	
	/**
     * This is the constructs Pizza object with the size and type of sauce.
     *
     * @param size   the size of the pizza in inches
     * @param sauce  the type of sauce on the pizza
     */
	public Pizza(int size, String sauce) {
		this.sizeInInches = size;
		this.typeOfSauce = sauce;
		this.thinCrust = THIN_CRUST;
		this.topPings = new ArrayList<>();
		this.topPingCount = 0;
		this.basePrice = 0.0;
	}
	/**
     * This is the constructs Pizza object with the size and type of sauce.
     *
     * @param size       the size of the pizza in inches
     * @param basePrice  the base price of the pizza
     */
	public Pizza(int size, double basePrice) {
		this.sizeInInches = size;
		this.basePrice = basePrice;
		this.typeOfSauce =null;
		this.thinCrust = THIN_CRUST;
		this.topPings = new ArrayList<>();
		this.topPingCount = 0;
	}
	
	 /**
     * Sets the base price of the pizza.
     *
     * @param price  the base price of the pizza
     */
	public void setBasePrice(double price) {
		basePrice = price;
	}
	/**
     * Sets whether the pizza has a thin crust.
     *
     * @param yes  true if the pizza has a thin crust, false otherwise
     */
	public void setThinCrust(Boolean yes) {
		thinCrust = yes;
	}
	/**
     * get the type of sauce on the pizza.
     *
     * @return the type of sauce on the pizza
     */
	public String getTypeOfSauce() {
		return typeOfSauce;
	}
	/**
     * get the toppings on the pizza.
     *
     * @return the toppings on the pizza
     */
	public ArrayList<FoodItem> getToppings() {
	    return topPings; 
	}
	/**
     * get the base price of the pizza.
     *
     * @return the base price of the pizza
     */
	public double getBasePrice() {
		return basePrice;
	}
	
	/**
     * Adds a topping to the pizza.
     *
     * @param item  the topping to be added
     */
	public void addTopping(FoodItem item) {
		topPings.add(item);
	}
	/**
     * get the size of the pizza in inches.
     *
     * @return the size of the pizza in inches
     */
	public int sizeInInches() {
	        return sizeInInches;
	}
	
	/**
     * Returns a string representation of the Pizza .
     *
     * @return a string representation of the Pizza 
     */
    @Override
	public String toString() {
		return sizeInInches +"Pizza with" + typeOfSauce + "and" + topPingCount +"topPings";
	}
	
	/**
     * Calculates the delivery cost for the pizza based on its size.
     *
     * @return the delivery cost for the pizza
     */
    @Override
	public double deliveryCost() {
		double cost = 0;
		switch(sizeInInches) {
		case 10:
			cost=2.50;
			break;
		case 12:
			cost = 3.50;
			break;
		case 14:
			cost = 4.75;
			break;
		default : 
			cost = 0.0;
			break;
		}
		return cost;
	}
	
    /**
     * Calculates the total price of the pizza including toppings and delivery cost.
     *
     * @return the total price of the pizza
     */
	public double price() {
		double topPingPrice = 0.0;
		for(FoodItem topping : topPings) {
			if (topping != null) {
				topPingPrice += topping.price();
	        }
		}
		return topPingPrice + basePrice;
	}
	/**
     * Calculates the price of the pizza including toppings and delivery cost.
     *
     * @return the total price of the pizza
     */
	public double totalPrice() {
		return price() + deliveryCost();
	}
	
}
