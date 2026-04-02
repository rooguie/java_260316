package costomException;

public class OutOfStockException extends IllegalAccessException {

	private static final long serialVersionUID=1L;
	
	
	public OutOfStockException(String message) {
		super(message);
	}
	
}
