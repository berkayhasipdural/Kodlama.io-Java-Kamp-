package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Table(name = "cars")
@Data// getter ve setter oluturur
@AllArgsConstructor //parametreli constructor oluşturur
@Entity //entity(nesne) olduğunu belirtir
public class Car {
	@Id//id olduğunu belirtir
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Id otomatik artar
	@Column(name = "id")//id adında kolon oluşturur
	private int id;

	@Column(name = "plate", unique = true)//plate adında kolon oluşturur ve bunun benzersiz olduğunu belirtir
	private String plate;

	@Column(name="dailyPrice")//daily price adında kolon oluşturur
	private  double dailyPrice;
	
	@Column(name="modelYear")//model year adında kolon oluşturur
	private int modelYear;

	@Column(name = "state")// state adında kolon oluşturur
	private int state;// 1 - available , 2 - ranted 3-Maintenance

	@ManyToOne//ilişkilendirme için kullanılır
	@JoinColumn(name = "model_id")
	private Model model;

}
