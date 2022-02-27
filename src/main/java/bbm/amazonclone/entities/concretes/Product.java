package bbm.amazonclone.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="amazon_product")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="image")
	private String image;
	
	@Column(name="price")
	private float price;
	
	@Column(name="rating")
	private int rating;
	
	
	public Product(int id, String title, String image, float price, int rating) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.price = price;
		this.rating = rating;
	}


	public Product() {
		
	}

}
