package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity; //atributo
	
	public double totalValueInStock() {
		return price * quantity; //somar e retornar o preço vezes a quantidade
	}
	
	public void addProducts(int quantity) { //método
		this.quantity += quantity; //especificando que desejo acessar o atributo, e não a classe (ambas de nome quantity)
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}
