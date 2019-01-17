package pet_shop;

public class pet_shop {
	static public void main(String[] args){
		pet Alice = new pet(200.0, 2.0, "cat", 10);
		pet Bob = new pet(300.0, 5, "dog", 3);
		pet Cona = new pet(120, 1, "bird", 1);
		
		System.out.println("Cat: " + Alice.sale_price());
		System.out.println("Dog: " + Bob.sale_price());
		System.out.println("Bird: " + Cona.sale_price());
	}

	
}
