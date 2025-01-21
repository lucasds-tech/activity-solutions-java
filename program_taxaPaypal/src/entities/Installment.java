package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate dataVenc;
	private Double quantia;
	
	public Installment() {
	}

	public Installment(LocalDate dataVenc, Double quantia) {
		this.dataVenc = dataVenc;
		this.quantia = quantia;
	}

	public LocalDate getDataVenc() {
		return dataVenc;
	}

	public void setDataVenc(LocalDate dataVenc) {
		this.dataVenc = dataVenc;
	}

	public Double getQuantia() {
		return quantia;
	}

	public void setQuantia(Double quantia) {
		this.quantia = quantia;
	}

	@Override
	public String toString() {
		return dataVenc.format(fmt) + " - " + String.format("%.2f", quantia);
	}
	
		
}
