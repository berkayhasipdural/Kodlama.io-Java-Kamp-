package kodlama.io.rentACar.core.utilities.exceptions;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getter ve setter oluşturur
@AllArgsConstructor//Parametreli constructer oluşturur
@NoArgsConstructor//Parametresiz constructer oluşturur
public class ValidationProblemDetails extends ProblemDetails{
	private Map<String, String> validationErrors;
}
