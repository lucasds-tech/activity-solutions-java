package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc; // ESTÁ FUNÇÃO PERMITE UTILIZAR INFORMAÇÃO DE OUTRA CLASSE/PACOTE 
		
		System.out.printf("Informe o número da conta: ");
		int conta = sc.nextInt(); // SOLICITANDO INFORMAÇÃO DO USUARIO
		System.out.printf("Informe o titular da conta: ");
		sc.nextLine(); // PARA CONSUMIR A QUEBRA DE LINHA QUE FALTOU NO 'NEXTINT' ACIMA
		String titular = sc.nextLine(); // SOLICITANDO INFORMAÇÃO DO USUARIO
		System.out.printf("Existe um depósito inicial (s/n)? ");
		char resposta = sc.next().charAt(0); // CRIANDO RESPOSTA DE 2 CARACTER COM IF-ELSE 
		if(resposta == 's') { // CONFIRMANDO A RESPOSTA DO USUARIO COM CHAR PARA DAR CONTINUIDADE
			System.out.printf("Insira o valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			acc = new Account(conta, titular, depositoInicial); // INSTANCIAÇÃO DO CONSTRUTOR1
		}
		else {
			acc = new Account(conta, titular); // INSTANCIAÇÃO DO CONSTRUTOR2
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(acc);
		
		System.out.println();
		System.out.printf("Introduza um valor de depósito: ");
		double valorDeposito = sc.nextDouble();
		acc.deposito(valorDeposito); // PASSANDO COMO ARGUMENTO '(...)'
		System.out.println("Dados da conta atualizados: ");
		System.out.println(acc);
		
		System.out.println();
		System.out.printf("Insira um valor de saque: ");
		double taxa = sc.nextDouble();
		acc.saque(taxa);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(acc);
		
		sc.close();
	}
}

		