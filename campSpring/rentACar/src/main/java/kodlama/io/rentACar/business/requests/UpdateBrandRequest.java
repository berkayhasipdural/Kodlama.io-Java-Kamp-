package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getter ve setter oluşturur
@AllArgsConstructor//Parametreli constructer oluşturur
@NoArgsConstructor//Parametresiz constructer oluşturur
public class UpdateBrandRequest {
	private int id;
	private String name;
}
