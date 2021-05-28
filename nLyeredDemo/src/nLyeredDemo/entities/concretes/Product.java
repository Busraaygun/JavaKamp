package nLyeredDemo.entities.concretes;

import nLyeredDemo.entities.abstracts.Entity; 

public class Product implements Entity {

	private int id;
	private int categoryId;
	private String name;
	private double unitePrice;
	private int unitInStock;
	
	public Product() {}

	public Product(int id, int categoryId, String name, double unitePrice, int unitInStock) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitePrice = unitePrice;
		this.unitInStock = unitInStock;
	}

	public int getId() {
		return id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public String getName() {
		return name;
	}

	public double getUnitePrice() {
		return unitePrice;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUnitePrice(double unitePrice) {
		this.unitePrice = unitePrice;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	
}
