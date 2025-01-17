package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee(); // empregado
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.print("Which percetage to increase salary? "); // % em aumento de salario
		double percentage = sc.nextDouble(); // leitura da porcentagem informada pelo usuario
		emp.increaseSalary(percentage); // atualização da porcentagem, dentro do objeto 'emp'
		
		System.out.println();
		System.out.println("Updated data: " + emp); // dados atualizados
		
		sc.close();

	}

}