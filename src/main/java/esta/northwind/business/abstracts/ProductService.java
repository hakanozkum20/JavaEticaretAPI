package esta.northwind.business.abstracts;

import java.util.List;

import esta.northwind.core.utilities.results.DataResult;
import esta.northwind.core.utilities.results.Result;
import esta.northwind.entities.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll(); 
	Result add(Product product);
	

}
 