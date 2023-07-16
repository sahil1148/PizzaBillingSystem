
public class Main {

	public static void main(String[] args) {

		/*
		 * Pizza pizza = new Pizza(false); pizza.addExtraCheese();
		 * pizza.addExtraTopping(); pizza.takeAway(); pizza.getBill();
		 */
		
		DeluxPizza dp = new DeluxPizza(true);
		dp.addExtraCheese();
		dp.addExtraTopping();
		dp.getBill();
		
	}

}
