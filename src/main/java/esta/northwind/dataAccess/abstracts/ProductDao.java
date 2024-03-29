package esta.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import esta.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
}
