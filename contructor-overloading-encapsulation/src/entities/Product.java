package entities;

public class Product {
	
	private String name;  // ATRIBUTO
	private double price; // ATRIBUTO
	private int quantity; // ATRIBUTO
	
	public Product() { // CONSTRUTOR PADRÃO
	}
	
	public Product(String name, double price, int quantity) {
		this.name =  name; // PALAVRA 'THIS' = UMA REFERENCIA PARA O PRÓPRIO OBJETO
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name =  name; 
		this.price = price;
		quantity = 0; // OPCIONAL
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) { // 'VOID' NÃO RETORNARÁ NADA
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity; //SOMAR E RETORNAR O PREÇO VEZES A QUANTIDADE
	}
	
	public void addProducts(int quantity) { // MÉTODO
		this.quantity += quantity; // ESPECIFICANDO QUE DESEJO ACESSAR O ATRIBUTO, E NÃO A CLASSE ( AMBAS DE NOME QUANTITY)
	}								
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { // SOBREPONDO A OPERAÇÃO STRING PADRÃO QUE JÁ VEM NO OBJECT
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
