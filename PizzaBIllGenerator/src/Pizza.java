
public class Pizza {

	private int price;
	private Boolean veg;
	private int extraCheesePrice = 100;
	private int extraToppingPrice = 150;
	private int takeAwayPrice = 20;
	private int basePizzaPrice;

	private Boolean isExtraCheeseAdded = false;
	private Boolean isExtraToppingAdded = false;
	private Boolean isOptedForTakeAway = false;

	public Pizza(Boolean veg) {
		this.veg = veg;

		if (this.veg == true) {
			this.price = 300;
		} else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}

	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		this.price += extraCheesePrice;
	}

	public void addExtraTopping() {
		isExtraToppingAdded = true;
		this.price += extraToppingPrice;
	}

	public void takeAway() {
		isOptedForTakeAway = true;
		this.price += takeAwayPrice;
	}

	public void getBill() {
		String bill = "";
		System.out.println("Base Price " + basePizzaPrice);
		if(isExtraCheeseAdded) {
			bill += "Extra Cheese added " + extraCheesePrice + "\n";
		}
		
		if(isExtraToppingAdded) {
			bill += "Extra Topping Added " + extraToppingPrice + "\n";
		}
		if (isOptedForTakeAway) {
			bill += "opted for take away " + takeAwayPrice + "\n";
		}
		
		bill += "Bill " + this.price + "\n";
		System.out.println(bill);

	}

}
