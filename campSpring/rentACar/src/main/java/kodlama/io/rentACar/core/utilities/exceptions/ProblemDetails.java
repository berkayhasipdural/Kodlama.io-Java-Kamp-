package kodlama.io.rentACar.core.utilities.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter ve setter oluşturur
@AllArgsConstructor // Parametreli constructer oluşturur
@NoArgsConstructor // Parametresiz constructer oluşturur
public class ProblemDetails {
	String message;

}
