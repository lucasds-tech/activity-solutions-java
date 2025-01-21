package services;

public class PaypalService implements OnlinePaymentService {

	private static final double TAXA_PAGAMENTO = 0.02;
	private static final double JUROS_PARCELA = 0.01;
	
	@Override
	public double paymentFee(double quantia) {
		return quantia * TAXA_PAGAMENTO;
	}
	
	@Override
	public double interest(double quantia, int meses) {
		return quantia * JUROS_PARCELA * meses;
	}

}
