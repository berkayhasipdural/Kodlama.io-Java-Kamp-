package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.business.rules.BrandBusinessRules;
import kodlama.io.rentACar.core.utilities.mappers.ModelMappersService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;

@Service //Sınıfın service olduğunu belirtir
@AllArgsConstructor //Constructer oluşturmaktadır
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	private ModelMappersService modelMappersService;
	private BrandBusinessRules brandBusinessRules;

	@Override
	public List<GetAllBrandsResponse> getAll() { //Bütün markaları çağırır

		List<Brand> brands = brandRepository.findAll();//veritabanını tarar

		List<GetAllBrandsResponse> brandsResponse = (List<GetAllBrandsResponse>) brands.stream()
				.map(brand -> this.modelMappersService.forResponse().map(brand, GetAllBrandsResponse.class))
				.collect(Collectors.toList()); //Brand nesnesini veritabanı türüne çeviririz.
		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) { //Marka ekler
		
		this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());//Belirtilen iş kuralını çalıtırır

		Brand brand = this.modelMappersService.forRequest().map(createBrandRequest, Brand.class);//veritabanı türünü brand nesnesine çeviririz.

		this.brandRepository.save(brand); //veritabanına kayıt yapmakta

	}

	@Override
	public GetByIdBrandResponse getById(int id) { //id ile marka çaırır
		Brand brand = this.brandRepository.findById(id).orElseThrow();//id ile arama yapar , bulamaz ise hata fırlatır
		GetByIdBrandResponse response = this.modelMappersService.forResponse().map(brand, GetByIdBrandResponse.class);//brand nesnesini veritabanı türüne çevirir
		return response;
	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {//kayıtlı veriye güncelleme yapar
		Brand brand = this.modelMappersService.forRequest().map(updateBrandRequest, Brand.class);//brand nesnesine çevirir
		this.brandRepository.save(brand);//veritabanına kayıt yapmakta

	}

	@Override
	public void delete(int id) {//veritabanındaki nesneyi siler
		this.brandRepository.deleteById(id);

	}
	

}
