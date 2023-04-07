package kodlama.io.rentACar.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data//getter ve setter oluşturur
@AllArgsConstructor//Parametreli constructer oluşturur
@NoArgsConstructor//Parametresiz constructer oluşturur

public class CreateBrandRequest {
	@NotNull
	@NotBlank
	@Size(min = 3, max = 20)//olması gereken size aralığını belirtir
	private String name;
}
