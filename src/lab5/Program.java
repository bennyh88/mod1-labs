package lab5;

import java.util.ArrayDeque;

public class Program {
	public static ArrayDeque<ShoppingBasket> baskets = new ArrayDeque<ShoppingBasket>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo = new Zoo();
		//part2();
		
		
	}
	
	public void part2() {

		baskets.add(new ShoppingBasket());
		baskets.add(new ShoppingBasket());
		baskets.add(new ShoppingBasket());
		baskets.add(new ShoppingBasket());
		baskets.add(new ShoppingBasket());

		for (ShoppingBasket basket : baskets) {
			basket.add(new ShoppingBasketItem("ProductA", 3, 1.99));
			basket.add(new ShoppingBasketItem("ProductB", 2, 9.99));
			basket.add(new ShoppingBasketItem("ProductC", 1, 99.99));
		}
		
		processBaskets();
		
	}
	
	public static void processBaskets() {
		int count = 0;
		for (ShoppingBasket basket : baskets) {
			System.out.println("Basket" + count);
			for (ShoppingBasketItem item : basket.basketItems) {
				System.out.println(item.getDetails());
			}
			System.out.println("");
			count++;
		}
	}

}
