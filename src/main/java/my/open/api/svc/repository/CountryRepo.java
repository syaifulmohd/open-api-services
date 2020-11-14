package my.open.api.svc.repository;

import org.springframework.data.repository.CrudRepository;

import my.open.api.svc.model.Country;

public interface CountryRepo extends CrudRepository<Country, Integer>{

}
