package kodlama.io.rentACar.business.requests.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateModelRequest {
	private int id;
	private String name;
	
	@NotNull  
	private int brandId;
}
