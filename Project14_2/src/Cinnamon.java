
public class Cinnamon extends CondimentDecorator{
	Beverage beverage;
	public Cinnamon(Beverage b) {
		this.beverage = b;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Cinnamon";
	}
	
	public double cost() {
		return .50 + beverage.cost();
	}
}
