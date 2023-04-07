package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;



public interface BrandRepository extends JpaRepository<Brand,Integer>{ //jpa repository den extends yaptığımız için işlerimiz kolaylaır :)
	boolean existsByName(String name); //Spring JPA keywordu(exist , find ve benzeri) otomatik kendisi nesneyi aramaktadır.
	}
