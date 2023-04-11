package lt.lhu.unit15.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> findProd = new ArrayList<Product>();
		List<Product> delProd = new ArrayList<Product>();
		Fridge fridge = new Fridge();
		boolean isProductInTheFridge;

		isProductInTheFridge = fridge.add(new Product("Bread", 450, 1));
		isProductInTheFridge = fridge.add(new Product("Milk", 950, 2));
		isProductInTheFridge = fridge.add(new Product("Fish", 600, 25));
		isProductInTheFridge = fridge.add(new Product("Meat", 1000, 12));
		isProductInTheFridge = fridge.add(new Product("Milk", 950, 2));

		isProductInTheFridge = fridge.add(new Product("Cheese", 300, 5));
		if (isProductInTheFridge == false) {
			System.out.println("Много есть вредно.");
		}

		fridge.printProduct();

		Boolean isFavoriteFoodInFridge = fridge.isInFridge(new Product("Meat", 1000, 12));
		System.out.println("Favorite food is in fridge: " + isFavoriteFoodInFridge);

		findProd.add(new Product("Bread", 450, 1));
		findProd.add(new Product("Milk", 950, 2));
		findProd.add(new Product("Fish", 600, 25));
		fridge.printFoundProducts(fridge.findProduct(findProd));

		delProd.add(new Product("Bread", 450, 1));
		delProd.add(new Product("Milk", 950, 2));
		fridge.findAndDelProduct(delProd);

		fridge.printProduct();
	}
}
