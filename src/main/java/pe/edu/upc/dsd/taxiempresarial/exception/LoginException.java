package pe.edu.upc.dsd.taxiempresarial.exception;

public class LoginException extends Exception {

	private static final long serialVersionUID = 3332421583748907236L;

	public LoginException() {
		super();
	}

	public LoginException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoginException(String message) {
		super(message);
	}

	public LoginException(Throwable cause) {
		super(cause);
	}

}
