package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand,Integer>{

	// JpaRepository bizim için bellekte bir class üretip BrandRepository interface'ini
	// implements etmiş gibi gösteriyor ve veritabanı ile ilgili işlemlerde çok büyük kolaylık sağlıyor
	
	
	
}
