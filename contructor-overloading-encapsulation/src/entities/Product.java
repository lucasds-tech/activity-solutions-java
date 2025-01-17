package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity; // ATRIBUTO
	
	public Product(String name, double price, int quantity) {
		this.name =  name; // PALAVRA 'THIS' = UMA REFERENCIA PARA O PRÓPRIO OBJETO
		this.price = price;
		this.quantity = quantity;
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
