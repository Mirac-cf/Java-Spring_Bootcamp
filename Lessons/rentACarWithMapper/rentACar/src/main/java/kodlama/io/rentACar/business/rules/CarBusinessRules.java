package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.core.utilities.exeptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.CarRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CarBusinessRules {
	private CarRepository carRepository;
	
	
	public void checkIfCarIdExists(int id) {
		if(!carRepository.existsById(id)) {
			throw new BusinessException("Car id is not found");
		}
	}
	
}
