package my.open.api.svc.repository;

import org.springframework.data.repository.CrudRepository;

import my.open.api.svc.model.CountryDetails;

public interface CountryDetailsRepo extends CrudRepository<CountryDetails, Long>{

}
