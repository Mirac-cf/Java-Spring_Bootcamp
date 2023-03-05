package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.core.utilities.exeptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class ModelBusinessRules {
	private ModelRepository modelRepository;
	
	public void checkIfModelNameExists(String name) {
		if(modelRepository.existsByName(name)) {
			throw new BusinessException("Model name already exists");   //Java exeption types
		}
	}
	
	public void checkIfModelIdExists(int id) {
		if(!modelRepository.existsById(id)) {
			throw new BusinessException("Model id is not found");
		}
	}
	
	
	
}
