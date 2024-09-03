package starbuzz;

public abstract class CoffeeDecorator extends Coffee {
	protected Coffee coffee;
	public abstract String getDescription();
}
