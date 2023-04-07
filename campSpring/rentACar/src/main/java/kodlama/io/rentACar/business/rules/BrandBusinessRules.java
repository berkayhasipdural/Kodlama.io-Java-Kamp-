package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor//Parametreli constructer oluşturur
@Service//sınıfın service olduğunu belirtir
public class BrandBusinessRules {

	private BrandRepository brandRepository;

	public void checkIfBrandNameExists(String name) {//isim önceden varmı iş kuralı yazılır
		if (this.brandRepository.existsByName(name)) {
			throw new BusinessException("Brand name already exist"); // bu hata çalışma anında olur bu yüzden runtimeExcepiton kullanmaktayız
		}
	}
}
