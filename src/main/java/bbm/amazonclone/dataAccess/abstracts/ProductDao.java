package bbm.amazonclone.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bbm.amazonclone.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
