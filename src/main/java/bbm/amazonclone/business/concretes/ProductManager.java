package bbm.amazonclone.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bbm.amazonclone.business.abstracts.ProductService;
import bbm.amazonclone.core.utilities.results.DataResult;
import bbm.amazonclone.core.utilities.results.Result;
import bbm.amazonclone.core.utilities.results.SuccessDataResult;
import bbm.amazonclone.core.utilities.results.SuccessResult;
import bbm.amazonclone.dataAccess.abstracts.ProductDao;
import bbm.amazonclone.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
		
	}

	@Override
	public Result add(Product product) {
	
		this.productDao.save(product);
		return new SuccessResult("Yeni ürün sisteme eklendi.");
	}

	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Sistemdeki ürünler getirildi.");
	}

}
