package lt.lhu.unit15.main;

import java.util.Objects;

public class Product {
	private String title;
	private int weight;
	private double price;

	public Product() {
	}

	public Product(String title, int weight, double price) {
		this.title = title;
		this.weight = weight;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void print() {
		System.out.println(
				"Product - title: " + this.getTitle() + ", weight " + this.getWeight() + ", price " + this.getPrice());
		System.out.println();
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, title, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return price == other.price && Objects.equals(title, other.title) && weight == other.weight;
	}

	@Override
	public String toString() {
		return "Рroduct [title=" + title + ", weight=" + weight + ", price=" + price + "]";
	}

}
