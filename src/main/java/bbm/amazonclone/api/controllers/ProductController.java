package bbm.amazonclone.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bbm.amazonclone.business.abstracts.ProductService;
import bbm.amazonclone.core.utilities.results.DataResult;
import bbm.amazonclone.core.utilities.results.Result;
import bbm.amazonclone.entities.concretes.Product;

@RestController
@RequestMapping("/Amazonclone/product")
@CrossOrigin
public class ProductController	 {
	
	private ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Product>> productGetAll(){
		return this.productService.getAll();
	}

	@PostMapping("/add") 
	public Result productAdd(@RequestBody Product product) {
		return this.productService.add(product);
	}
}
