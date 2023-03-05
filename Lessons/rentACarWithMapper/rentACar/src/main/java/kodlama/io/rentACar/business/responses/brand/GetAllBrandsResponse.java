package kodlama.io.rentACar.business.responses.brand;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// gelen istek --> request
// verilen yanıt --> response

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandsResponse {
	private int id;
	private String name;
}
