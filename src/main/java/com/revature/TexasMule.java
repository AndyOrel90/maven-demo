/**
 * 
 */
package com.revature;

import java.util.Arrays;

/**
 * @author Mehrab
 *
 */
public class TexasMule {
	private String ingredients[];

	public String[] getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ...ingredients) {
		this.ingredients = ingredients;
	}

	public static void main(String ...args) {
		if (args.length > 0) {
			TexasMule firstDrink = new TexasMule();	
			firstDrink.ingredients = args;
			Arrays.sort(firstDrink.ingredients);
			System.out.println(Arrays.toString(firstDrink.ingredients));
		}	
		
		String[] newIngredients = {"Pig", "Lion"};
		TexasMule secondDrink = new TexasMule();
		secondDrink.setIngredients("Pig", "Lion", "Bear");
		for (int i = 0; i < secondDrink.getIngredients().length; i++) {
			System.out.println(secondDrink.getIngredients()[i]);
		}
		
		for(String s : secondDrink.getIngredients()) {
			System.out.println(s);
		}
	}
}
