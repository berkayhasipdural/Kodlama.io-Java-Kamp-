package kodlama.io.rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getter ve setter oluşturur
@AllArgsConstructor//Parametreli constructer oluşturur
@NoArgsConstructor//Parametresiz constructer oluşturur
public class GetByIdBrandResponse {
	private int id;
	private String name;
}
