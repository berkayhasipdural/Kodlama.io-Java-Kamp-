package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "brands")
@Data //getter ve setter oluşturur
@AllArgsConstructor //parametreli constructer oluşturur
@NoArgsConstructor //parametresiz constructer oluturur
@Entity //entity (nesne) olduğunu belirtir
public class Brand {

	@jakarta.persistence.Id //id olduğunu belirtir
	@jakarta.persistence.GeneratedValue(strategy = GenerationType.IDENTITY) // Id otomatik artar
	@jakarta.persistence.Column(name = "id")//id adında kolon oluşturur
	private int id;

	@jakarta.persistence.Column(name = "name")//name adında kolon oluşturur
	private String name;
	
	@OneToMany(mappedBy = "brand") //ilişkilendirme için kullanılır
	List<Model> models;

}
