package esta.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import esta.northwind.business.abstracts.ProductService;
import esta.northwind.core.utilities.results.DataResult;
import esta.northwind.core.utilities.results.Result;
import esta.northwind.core.utilities.results.SuccessDataResult;
import esta.northwind.core.utilities.results.SuccessResult;
import esta.northwind.dataAccess.abstracts.ProductDao;
import esta.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;
		
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public DataResult<List<Product>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");

	}


	@Override
	public Result add(Product product) {

		this.productDao.save(product);
		
		return new SuccessResult("Urun eklendi");
	}

}
