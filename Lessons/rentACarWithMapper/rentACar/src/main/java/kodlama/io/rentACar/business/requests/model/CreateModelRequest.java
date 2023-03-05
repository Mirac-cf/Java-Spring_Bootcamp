package kodlama.io.rentACar.business.requests.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelRequest {
	// javax.validation.constraints ozellikleri diye google dan aratirsak alttaki ozellikler ve bir cogu cikar
		
	@NotNull  // bu ozellik null olamaz 
	@Size(min = 3, max=20) // karakter sayisi
	private String name;
	
	@NotNull  
	private int brandId;
}
