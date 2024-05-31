package pizza.fooditems;

/**
 * The FoodItem class represents a food item that can be used as a topping for pizza or other dishes.
 */
public class FoodItem {
	/** The name of the food item. */
    private String name;
    /** The units of measure for the quantity of the food item. */
    private String unitsOfMeasure;
    /** The quantity of the food item. */
    private float quantity;
    /** The price per unit of the food item. */
    private double pricePerUnit;
    /**
     * Constructs a FoodItem object with the  name.
     *
     * @param name the name of the food item
     */
    public FoodItem(String name) {
        this.name = name;
        this.unitsOfMeasure = "cup";
        this.quantity = 0.0f;
        this.pricePerUnit =0.0;
    }
    /**
     * Sets the units of measure for the food item.
     *
     * @param unitsOfMeasure the units of measure for the food item
     */
    public void setUnitsOfMeasure(String unitsOfMeasure) {
    	this.unitsOfMeasure = unitsOfMeasure;
    }
    /**
     * Sets the quantity of the food item.
     *
     * @param quantity the quantity of the food item
     */
    public void setQuantity(float quantity) {
    	this.quantity =quantity;
    }
    /**
     * Sets the price per unit of the food item.
     *
     * @param price the price per unit of the food item
     */
    public void setPricePerUnit(double price) {
        this.pricePerUnit = price;
    }
    /**
     * get the name of the food item.
     *
     * @return the name of the food item
     */
    public String getName() {
        return name;
    }
    /**
     * Calculates the total price of the food item
     *
     * @return the total price of the food item
     */
    public double price() {
        return quantity * pricePerUnit;
    }
}