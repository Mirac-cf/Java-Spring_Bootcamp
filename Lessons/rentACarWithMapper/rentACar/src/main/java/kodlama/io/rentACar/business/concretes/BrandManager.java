package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandsResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;

@Service  //bu sınıf bir business nesnesidir
@AllArgsConstructor  // constructor injection olayını lombok ile kısaltmıs olduk
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	private ModelMapperService modelMapperService;

	
	@Override
	public List<GetAllBrandsResponse> getAll() {
		List<Brand> brands = brandRepository.findAll();
		/*
		List<GetAllBrandsResponse> brandsResponses = new ArrayList<GetAllBrandsResponse>();
		
		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			
			brandsResponses.add(responseItem);
		}
		*/
		
		// yukardaki kod mapper kullanilmadan once
		
		List<GetAllBrandsResponse> brandsResponses = brands.stream().
				map(brand -> this.modelMapperService.forResponse().
						map(brand,GetAllBrandsResponse.class)).toList();
		// burda stream api ile brands Listesinin icinde tek tek gezdik ve her bir brand'i mapper ile GetAllBrandsResponse class'ına donusturduk
		// sonrada toList ile listeye cevirdik
		return brandsResponses;
	}


	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		//Brand brand = new Brand();
		//brand.setName(createBrandRequest.getName());
		
		Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
		// map ile gelen createBrandRequest'i Brands tipine cevirdik ve tek tek yazmaktan kurtulduk
		// map(createBrandRequest, Brand.class) burda  1.'si kaynak class  2.'si donusturmke istedigimiz class
		
		this.brandRepository.save(brand);
		
	}


	@Override
	public GetByIdBrandsResponse getById(int id) {
		Optional<Brand> brand = brandRepository.findById(id);
		GetByIdBrandsResponse getByIdBrandsResponse = this.modelMapperService.forRequest().map(brand, GetByIdBrandsResponse.class);
		return getByIdBrandsResponse;
	}


	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
		this.brandRepository.save(brand);
	}


	@Override
	public void delete(int id) {
		brandRepository.deleteById(id);;
	}

}
