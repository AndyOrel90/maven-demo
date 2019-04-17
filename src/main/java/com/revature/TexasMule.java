/**
 * 
 */
package com.revature;

/**
 * @author Mehrab
 *
 */
public class TexasMule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ingredient1 = null;
		String ingredient2 = null;
		if (ingredient1 == null || ingredient2 == null) {
			ingredient1 = System.getProperty("ing1");
			ingredient2 = System.getProperty("ing2");
		}
		
		TexasMule firstDrink = new TexasMule();
		String finishedFirstDrink = firstDrink.add(ingredient1, ingredient2);
		
		System.out.println(finishedFirstDrink);
	}
	
	public String add(String a, String b) {
		return a + b;
	}

}
