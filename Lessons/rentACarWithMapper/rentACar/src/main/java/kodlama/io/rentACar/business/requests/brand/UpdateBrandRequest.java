package kodlama.io.rentACar.business.requests.brand;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrandRequest {
	@NotNull  // bu ozellik null olamaz 
	private int id;
	
	@NotNull  // bu ozellik null olamaz 
	@Size(min = 2, max=30) // karakter sayisi
	private String name;
}
