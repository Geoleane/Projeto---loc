package exception;

public class NaoEncontradoException extends Exception {
	private static final long serialVersionUID = 1L;
	public NaoEncontradoException(String s) {
		System.out.println(s);
	}
}
