package pet_shop;

public class pet {
	public String type;
	private double bought_price;
	private double expenses;
	private int days;
	
	static private double profit = 1.15;
	public pet(double bought, double expen, String type, int day){
		this.bought_price = bought;
		this.expenses = expen;
		this.type = type;
		this.days = day;
		
	}
	public double sale_price(){
		double price = this.profit*(this.bought_price + this.expenses*this.days);
		return price;
	}
}
