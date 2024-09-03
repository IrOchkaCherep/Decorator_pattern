package starbuzz;

public class WithSugar extends CoffeeDecorator {

	public WithSugar(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public String getDescription() {
		return coffee.getDescription() + ", Sugar";
	}
	
	@Override
	public double cost() {
		return coffee.cost() + 10;
	}
}
