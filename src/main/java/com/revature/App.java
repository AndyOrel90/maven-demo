package com.revature;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

import com.revature.mule.MoscowMule;
import com.revature.mule.Mule;
import com.revature.mule.TexasMule;

public class App {

	public static void main(String ...args) {
		if (args.length > 0) {
			Mule firstDrink = new TexasMule();				
			String[] consoleIngredients = null;
			
			// Read from console
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line;
			try {
				while (!(line = br.readLine()).isEmpty()) {
					consoleIngredients = line.split(" ");
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				firstDrink.setIngredients(consoleIngredients);
				System.out.println(Arrays.toString(firstDrink.getIngredients()));	
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			Mule secondDrink = new MoscowMule();
			Scanner sc = new Scanner("mule donky");
			consoleIngredients = sc.nextLine().split(" ");
			secondDrink.setIngredients(consoleIngredients);
			System.out.println(Arrays.toString(secondDrink.getIngredients()));
			
			
			// Read from file
			Mule thirdDrink = new TexasMule();
			try (BufferedReader fr = new BufferedReader(new FileReader("input.txt"))) {
				while ((line = fr.readLine()) != null) {
					consoleIngredients = line.split(" ");
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				thirdDrink.setIngredients(consoleIngredients);
				System.out.println(Arrays.toString(thirdDrink.getIngredients()));
			}
			
			// Read from properties file
			Properties props = new Properties();
			try {
				props.load(new FileInputStream("app.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(props.getProperty("ing1"));
			System.out.println(props.getProperty("ing3", "Gator"));
		}	
		
		// Write to output.txt
		try (FileWriter fw = new FileWriter("output.txt", true)){
			fw.append("Hello World");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
