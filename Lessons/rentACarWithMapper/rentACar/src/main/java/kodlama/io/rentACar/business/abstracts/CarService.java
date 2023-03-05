package kodlama.io.rentACar.business.abstracts;

import java.util.List;
import kodlama.io.rentACar.business.requests.car.CreateCarRequest;
import kodlama.io.rentACar.business.requests.car.UpdateCarRequest;
import kodlama.io.rentACar.business.responses.car.GetAllCarsResponse;
import kodlama.io.rentACar.business.responses.car.GetByIdCarResponse;

public interface CarService {
	List<GetAllCarsResponse> getAll();
	GetByIdCarResponse getById(int id);
	void add(CreateCarRequest createCarRequest);
    void update(UpdateCarRequest updateCarRequest);
	void delete(int id);
}
