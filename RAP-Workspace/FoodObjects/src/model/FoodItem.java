package model;

public class FoodItem {
	private String name;
	
	public FoodItem() {
		this.name = "Food item";
	}

	public FoodItem(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
}
