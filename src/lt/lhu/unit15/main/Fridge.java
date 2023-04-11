package lt.lhu.unit15.main;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
	private List<Product> products = new ArrayList<Product>();
	private int productsLimit = 5;

	public Fridge() {

	}

	public boolean add(Product product) {
		if (products.size() >= productsLimit) {
			return false;
		}
		products.add(product);
		return true;
	}

	public void printProduct() {
		for (Product product : products) {
			product.print();
		}
	}

	public boolean isInFridge(Product product) {
		return products.contains(product);
	}

	public List<Product> findProduct(List<Product> findProd) {
		if (findProd.size() == 1) {
			List<Product> results = new ArrayList<>();
			for (int i = 0; i < products.size(); i++) {
				if (findProd.get(0).equals(products.get(i))) {
					results.add(products.get(i));
				}
			}
			return results;
		} else if (findProd.size() > 1) {
			List<Product> manyResults = new ArrayList<>();
			for (int i = 0; i < products.size(); i++) {
				for (int j = 0; j < findProd.size(); j++) {
					if (findProd.get(j).equals(products.get(i))) {
						manyResults.add(products.get(i));
					}
				}
			}
			return manyResults;
		}
		return null;
	}

	public List<Product> findAndDelProduct(List<Product> findProd) {
		if (findProd.size() == 1) {
			for (int i = 0; i < products.size(); i++) {
				if (findProd.get(0).equals(products.get(i))) {
					products.remove(i);
				}
			}
			return products;
		} else if (findProd.size() > 1) {
			for (int i = 0; i < products.size(); i++) {
				for (int j = 0; j < findProd.size(); j++) {
					if (findProd.get(j).equals(products.get(i))) {
						products.remove(i);
					}
				}
			}
			return products;
		}
		return null;
	}

	public void printFoundProducts(List<Product> results) {
		System.out.println("----------------------Product----------------------");
		for (int i = 0; i < results.size(); i++) {
			Product goods = results.get(i);
			System.out.println("\t title: " + goods.getTitle());
			System.out.println("\t weight: " + goods.getWeight());
			System.out.println("\t price: " + goods.getPrice());
			System.out.println("-------------------------------------------------");
		}
		System.out.println("-------------------------------------------------");
	}

}
