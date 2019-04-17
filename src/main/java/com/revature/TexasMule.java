/**
 * 
 */
package com.revature;

/**
 * @author Mehrab
 *
 */
public class TexasMule {
	private String ingredient1 = "Horse";
	private String ingredient2 = "Donkey";

	public TexasMule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TexasMule(String ingredient1, String ingredient2) {
		super();
		this.ingredient1 = ingredient1;
		this.ingredient2 = ingredient2;
	}

	@Override
	public String toString() {
		return "TexasMule [ingredient1=" + ingredient1 + ", ingredient2=" + ingredient2 + "]";
	}

	public String getIngredient1() {
		return ingredient1;
	}

	public void setIngredient1(String ingredient1) {
		this.ingredient1 = ingredient1;
	}

	public String getIngredient2() {
		return ingredient2;
	}

	public void setIngredient2(String ingredient2) {
		this.ingredient2 = ingredient2;
	}

	public static void main(String[] args) {
		TexasMule firstDrink = new TexasMule();
		String finishedFirstDrink = firstDrink.add(firstDrink.getIngredient1(), firstDrink.getIngredient2());

		System.out.println(finishedFirstDrink);
	}

	/**
	 * @param ingredient1
	 * @param ingredient2
	 * @return
	 */
	public String add(String ingredient1, String ingredient2) {
		return ingredient1 + ingredient2;
	}

}
