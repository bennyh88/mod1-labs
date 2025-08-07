package lab5;

public class ShoppingBasketItem {
	private String productName;
	private int quantity;
	private double price;
	
	ShoppingBasketItem (String productName, int quantity, double price) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getDetails() {
		return String.format(
					"Product Name:%s, Quantity:%d, Price:%g", 
					this.productName, 
					this.quantity, 
					this.price
				);
	}
}
