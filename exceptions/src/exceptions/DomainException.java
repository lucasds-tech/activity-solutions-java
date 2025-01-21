package exceptions;

public class DomainException extends RuntimeException{ // RuntimeException - NÂO NECESSITARIA TRATAR O 'EXCEPTION'

	private static final long serialVersionUID = 1L; // (Serial Liable) PERMITINDO SER CONVERTIDO PARA BITS; TRAFEGAR EM REDES; GRAVADO EM ARQUIVOS ETC.
	
	public DomainException(String msg) {
		super(msg);
	}

}
