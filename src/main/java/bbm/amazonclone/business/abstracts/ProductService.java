package bbm.amazonclone.business.abstracts;

import java.util.List;

import bbm.amazonclone.core.utilities.results.DataResult;
import bbm.amazonclone.core.utilities.results.Result;
import bbm.amazonclone.entities.concretes.Product;

public interface ProductService {
	
	public Result add(Product product);
	public DataResult<List<Product>> getAll();

}
