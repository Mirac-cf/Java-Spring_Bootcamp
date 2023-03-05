package kodlama.io.rentACar.business.requests.brand;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest{
	@NotNull  // bu ozellik null olamaz 
	@Size(min = 3, max=20) // karakter sayisi
	private String name;
}
