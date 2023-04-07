package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.ModelService;
import kodlama.io.rentACar.business.requests.CreateModelRequest;
import kodlama.io.rentACar.business.responses.GetAllModelsResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMappersService;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import kodlama.io.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;

@Service//Sınıfın service olduğunu belirtit
@AllArgsConstructor //Constructer oluşturmaktadır
public class ModelManager implements ModelService{

	private ModelRepository modelRepository;
	private ModelMappersService modelMapperService;

	@Override
	public List<GetAllModelsResponse> getAll() { //bütün modelleri çağırır
		List<Model> models = modelRepository.findAll();//veritabanını tarar
		
		List<GetAllModelsResponse> modelsResponse = models.stream()
				.map(model->this.modelMapperService.forResponse()
						.map(model, GetAllModelsResponse.class)).collect(Collectors.toList());//model nesnesini veritabanı tütüne çevirir
		
		return modelsResponse;
	}

	@Override
	public void add(CreateModelRequest createModelRequest) {//Model ekleme işlemi yapar
		Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);//veritabanı türünü model nesnesine çevirir
		this.modelRepository.save(model);
	}

}
