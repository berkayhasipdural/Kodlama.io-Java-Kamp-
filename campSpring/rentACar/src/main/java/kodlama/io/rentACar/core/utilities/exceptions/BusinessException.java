package kodlama.io.rentACar.core.utilities.exceptions;
//Business exception için gerekneler yazılır
public class BusinessException extends RuntimeException {
	public BusinessException(String message) {//parametrede gönderilen exception message kullanıcıya iletilir
	super(message);
	}
}
