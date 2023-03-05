package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand,Integer>{
	
	// JpaRepository bizim için bellekte bir class üretip BrandRepository interface'ini
	// implements etmiş gibi gösteriyor ve veritabanı ile ilgili işlemlerde çok büyük kolaylık sağlıyor
	
	boolean existsByName(String name);  //spring jpa keywords
	// Jpa bizim icin veri tabanina gidip name alanina gore sorgu olusturuyor ve name alanıni kontrol ediyor 
	// eger varsa true donduruyor yoksa false
	// bunlar jpa keywords olarak gecer
	
	
	//boolean existsById(int id);
	
}
