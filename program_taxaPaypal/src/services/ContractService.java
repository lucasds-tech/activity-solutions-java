package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int meses) {
		
		double parcelaBasica = contract.getValorTotal() / meses;
		
		for (int i=1; i <= meses; i++) {
			LocalDate dataVenc = contract.getData().plusMonths(i);
			
			double juro = onlinePaymentService.interest(parcelaBasica, i);
			double taxa = onlinePaymentService.paymentFee(parcelaBasica + juro);
			double cota = parcelaBasica + juro + taxa; 
			
			contract.getInstallments().add(new Installment(dataVenc, cota));
		}
	}
}
