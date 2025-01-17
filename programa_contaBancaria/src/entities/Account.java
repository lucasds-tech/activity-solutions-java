package entities;

public class Account {

	private int conta;
	private String titular;
	private double saldo;
	
	public Account(int conta, String nome, double depositoInicial) { // CONSTRUTOR 1
		this.conta = conta;
		this.titular = nome;
		deposito(depositoInicial); //(ENCAPSULANDO) PROTEGE O CONSTRUTOR DE MUDANÇAS NO FUTURO, QUE POSSA SER FEITA NO 'VOID DEPOSITO', NAO AFETANDO ESTÁ PARTE 
	}

	public Account(int conta, String nome) { // CONSTRUTOR 2
		this.conta = conta;
		this.titular = nome;
	}

	public int getConta() { // OBTÉM DADOS
		return conta;
	}

	public String getNome() { // OBTÉM DADOS
		return titular;
	}

	public void setNome(String titular) { // TORNANDO OPCIONAL PARA ALTERAÇÃO DE NOME
		this.titular = titular;
	}

	public double getSaldo() { // OBTÉM DADOS
		return saldo;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public void saque(double quantia) {
		saldo -= quantia + 5.0; // ABATENDO '-=', A QUANTIA DO SALDO QUE É 5
	}
	
	public String toString() {
		return "Conta: " + conta
				+ ", Holder: " + titular
				+ String.format(", Saldo: $ %.2f", saldo);
	}
}



