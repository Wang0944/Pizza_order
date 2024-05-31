package pizza.services;

/**
 * This class is an order of a sudsy drinks. It implements the Deliverable interface.
 */
public class SudsOrder implements Deliverable {
	/** The name of the drinks. */
	private String name;
	/** The number of the drinks. */
	private int number;
	/** The size of the drinks. */
	private int sizeInML;
	
	/**
     * This is the Constructs .
     *
     * @param name      the name of the drinks
     * @param number    the quantity of the drinks
     * @param sizeInML  the size of the drinks)
     */
	public SudsOrder(String name, int number, int sizelnML) {
		this.name = name;
		this.number = number;
		this.sizeInML = sizelnML;
	}
	
	/**
     * get the name of the drinks.
     *
     * @return the name of the drinks
     */
	public String getName() {
		return this.name;
	}
	
	/**
     * get the number of the drinks.
     *
     * @return the number of the drinks
     */
	public int getNumber() {
		return this.number;
	}
	
	/**
     * get the size of the drinks.
     *
     * @return the size of the drinks
     */
	public int getSizelnML() {
		return this.sizeInML;
	}
	
	/**
     * Returns a string of the SudsOrder .
     *
     * @return a string  of the SudsOrder 
     */
    @Override
	public String toString() {
		return sizeInML + "suds" + name +"*" + number;
	}
	
    /**
     * Calculates the delivery cost for the SudsOrder.
     *
     * @return the delivery cost for the SudsOrder
     */
    @Override
	public double deliveryCost(){
		return 0.0;
	}
}
