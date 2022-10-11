package oop1;

//Classlar PascalCase olarak isimlendirilir. (İlk kelime de dahil her kelimenin ilk harfi büyük)
public class Product {
	//fieldler(name, unitPrice) camelCase olarak yaz‎l‎r. 
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl; //domaine göre isimlendirme??
	private int unitsInStock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
}
