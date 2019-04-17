package com.revature;

import java.util.Arrays;

public class App {

	public static void main(String ...args) {
		if (args.length > 0) {
			Mule firstDrink = new TexasMule();	
			firstDrink.ingredients = args;
			Arrays.sort(firstDrink.ingredients);
			System.out.println(Arrays.toString(firstDrink.ingredients));
			
			firstDrink.drink();
			
			firstDrink = new MoscowMule();
			firstDrink.drink();
		}	
		
		String[] newIngredients = {"Pig", "Lion"};
		Mule secondDrink = new TexasMule();
		secondDrink.setIngredients("Pig", "Lion", "Bear");
		for (int i = 0; i < secondDrink.getIngredients().length; i++) {
			System.out.println(secondDrink.getIngredients()[i]);
		}
		
		for(String s : secondDrink.getIngredients()) {
			System.out.println(s);
		}
	}

}
