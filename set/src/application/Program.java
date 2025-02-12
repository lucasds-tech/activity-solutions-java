package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Integer> udemy = new HashSet<>();
		Set<Integer> alura = new HashSet<>();
		Set<Integer> hotmart = new HashSet<>();
		
		int n;
		
		System.out.print("Quantos alunos para o curso da Udemy: ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int codigo = sc.nextInt();
			udemy.add(codigo);
		}
		
		System.out.print("Quantos alunos para o curso da Alura: ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int codigo = sc.nextInt();
			alura.add(codigo);
		}
		
		System.out.print("Quantos alunos para o curso da HotMart: ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int codigo = sc.nextInt();
			hotmart.add(codigo);
		}
		
		Set<Integer> total = new HashSet<>(udemy);
		total.addAll(alura);
		total.addAll(hotmart);
		
		System.out.print("Total de alunos: " + total.size());
		
		sc.close();
	}
}
