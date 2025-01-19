package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vetor = new Rent[10]; // DECLARANDO 10 POSIÇÕES/QUARTOS
		System.out.print("Quantos quartos serão alugados? ");
		//					How many rooms will be rented?
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.printf("Aluguel #%d:\n", i); // RENT
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: "); // ROOM
			int room = sc.nextInt();
			vetor[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		//	         		Busy rooms:
		for(int i=0; i<10; i++) {
			if(vetor[i] != null) { // SE O VETOR NA POSIÇÃO FOR DIFERENTE OU IGUAL A NULO
				System.out.println(i +": "+ vetor[i]);
			}
		}
		
		sc.close();
	}
}