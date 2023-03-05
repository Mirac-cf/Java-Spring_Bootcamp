package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;
import kodlama.io.rentACar.core.utilities.exeptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
	// is kurallari
	
	private BrandRepository brandRepository;
	
	
	public void checkIfBrandNameExists(String name) {
		if(brandRepository.existsByName(name)) {
			throw new BusinessException("Brand name already exists");   //Java exeption types
		}
	}
	
	public void checkIfBrandIdExists(int id) {
		if(!brandRepository.existsById(id)) {
			throw new BusinessException("Brand id is not found");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
