package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.CarService;
import kodlama.io.rentACar.business.requests.car.CreateCarRequest;
import kodlama.io.rentACar.business.requests.car.UpdateCarRequest;
import kodlama.io.rentACar.business.responses.car.GetAllCarsResponse;
import kodlama.io.rentACar.business.responses.car.GetByIdCarResponse;
import kodlama.io.rentACar.business.rules.CarBusinessRules;
import kodlama.io.rentACar.business.rules.ModelBusinessRules;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.CarRepository;
import kodlama.io.rentACar.entities.concretes.Car;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CarManager implements CarService{
	private CarRepository carRepository;
	private ModelMapperService modelMapperService;
	private CarBusinessRules carBusinessRules;
	private ModelBusinessRules modelBusinessRules;
	
	
	@Override
	public List<GetAllCarsResponse> getAll() {
		List<Car> cars = this.carRepository.findAll();
		
		List<GetAllCarsResponse> response = cars.stream().
				map(car->modelMapperService.forResponse().
						map(car, GetAllCarsResponse.class)).toList();
		
		return response;
	}

	@Override
	public GetByIdCarResponse getById(int id) {
		carBusinessRules.checkIfCarIdExists(id);
		
		Optional<Car> car = carRepository.findById(id);
		
		GetByIdCarResponse response = modelMapperService.forResponse().map(car, GetByIdCarResponse.class);
		return response;
	}

	@Override
	public void add(CreateCarRequest createCarRequest) {
		modelBusinessRules.checkIfModelIdExists(createCarRequest.getModelId());
		
		Car car = modelMapperService.forRequest().map(createCarRequest, Car.class);
		carRepository.save(car);
	}

	@Override
	public void update(UpdateCarRequest updateCarRequest) {
		carBusinessRules.checkIfCarIdExists(updateCarRequest.getId());
		modelBusinessRules.checkIfModelIdExists(updateCarRequest.getModelId());
		
		Car car = this.modelMapperService.forRequest().map(updateCarRequest, Car.class);
		
		this.carRepository.save(car);
	}

	@Override
	public void delete(int id) {
		carBusinessRules.checkIfCarIdExists(id);
		
		carRepository.deleteById(id);
	}

}
