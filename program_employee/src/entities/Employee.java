package entities;

public class Employee {
	
	public String name;
	public double grossSalary; // salario bruto
	public double tax; // taxa do salario
	
	public double netSalary() { // salario liquido
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percentage) { // aumentando salario
		return grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name 
			+ ", $ " 
			+ String.format("%.2f", netSalary());
	}
}