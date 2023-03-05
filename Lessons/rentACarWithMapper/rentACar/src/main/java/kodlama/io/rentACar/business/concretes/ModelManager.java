package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import kodlama.io.rentACar.business.abstracts.ModelService;
import kodlama.io.rentACar.business.requests.model.CreateModelRequest;
import kodlama.io.rentACar.business.requests.model.UpdateModelRequest;
import kodlama.io.rentACar.business.responses.model.GetAllModelsResponse;
import kodlama.io.rentACar.business.responses.model.GetByIdModelResponse;
import kodlama.io.rentACar.business.rules.BrandBusinessRules;
import kodlama.io.rentACar.business.rules.ModelBusinessRules;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import kodlama.io.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService{
	
	private ModelRepository modelRepository;
	private ModelMapperService modelMapperService;
	private ModelBusinessRules modelBusinessRules;
	private BrandBusinessRules brandBusinessRules;
	
	
	@Override
	public List<GetAllModelsResponse> getAll() {
		List<Model> models = modelRepository.findAll();
		
		List<GetAllModelsResponse> modelsResponse = models.stream()
				.map(model->this.modelMapperService.forResponse()
						.map(model, GetAllModelsResponse.class)).toList();
		
		return modelsResponse;
	}
	
	@Override
	public GetByIdModelResponse getById(int id) {
		this.modelBusinessRules.checkIfModelIdExists(id);
		
		Optional<Model> model = this.modelRepository.findById(id);
		GetByIdModelResponse getByIdModelResponse = modelMapperService.forResponse().map(model, GetByIdModelResponse.class);
		return getByIdModelResponse;
	}

	@Override
	public void add(CreateModelRequest createModelRequest) {
		this.modelBusinessRules.checkIfModelNameExists(createModelRequest.getName());
		this.brandBusinessRules.checkIfBrandIdExists(createModelRequest.getBrandId());
		
		Model model = modelMapperService.forRequest().map(createModelRequest, Model.class);
		modelRepository.save(model);
	}


	@Override
	public void update(UpdateModelRequest updateModelRequest) {
		modelBusinessRules.checkIfModelIdExists(updateModelRequest.getId());
		modelBusinessRules.checkIfModelNameExists(updateModelRequest.getName());
		brandBusinessRules.checkIfBrandIdExists(updateModelRequest.getBrandId());
		
		Model model = this.modelMapperService.forRequest().map(updateModelRequest, Model.class);
		this.modelRepository.save(model);
	}


	@Override
	public void delete(int id) {
		modelBusinessRules.checkIfModelIdExists(id);
		modelRepository.deleteById(id);
	}

	
	

}
