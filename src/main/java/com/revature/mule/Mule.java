package com.revature.mule;

public abstract class Mule implements Drinkable {

	protected String ingredients[];

	public Mule() {
		super();
	}

	public String[] getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ...ingredients) {
		this.ingredients = ingredients;
	}
	
	public abstract void mix();

}