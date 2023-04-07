package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="models")
@Data//getter ve setter oluşturur
@AllArgsConstructor//parametreli constructer oluşturur
@NoArgsConstructor//parametresiz constructer oluşturur
@Entity // entity (nesne) olduğunu belirtir
public class Model {
	@Id //id olduğunu belirtir
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Id otomatik artar
	@Column(name = "id")//id adında kolon oluşturur
	private int id;

	@Column(name = "name")//name adında kolon oluşturur
	private String name;

	@ManyToOne//ilişkilendirme için kullanılır
	@JoinColumn(name="brand_id")
	private Brand brand;
	
	@OneToMany(mappedBy = "model")//ilişkilendirme için kullanılır
	private List<Car> cars;
	
	
}
