package com.cuatroa.retodos.repository;

import com.cuatroa.retodos.model.Vegetarian;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retodos.repository.crud.VegetarianCrudRepository;

/**
 *
 * @author Nelson Rueda
 */
@Repository
public class VegetarianRepository {
    @Autowired
    private VegetarianCrudRepository repository;

    public List<Vegetarian> getAll() {
        return repository.findAll();
    }

    public Optional<Vegetarian> getClothe(String reference) {
        return repository.findById(reference);
    }
    
    public Vegetarian create(Vegetarian clothe) {
        return repository.save(clothe);
    }

    public void update(Vegetarian clothe) {
        repository.save(clothe);
    }
    
    public void delete(Vegetarian clothe) {
        repository.delete(clothe);
    }
    
    public List<Vegetarian> productByPrice(double precio) {
	return repository.findByPriceLessThanEqual(precio);
}
}
