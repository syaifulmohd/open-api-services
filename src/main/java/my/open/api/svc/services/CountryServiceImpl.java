package my.open.api.svc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.open.api.svc.model.Country;
import my.open.api.svc.model.CountryDetails;
import my.open.api.svc.repository.CountryRepo;
import my.open.api.svc.vo.CountryDetailVO;
import my.open.api.svc.vo.CountryVO;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepo countryRepo;

	@Override
	public List<CountryVO> fetchCountryInformationList() {

		List<CountryVO> response = new ArrayList<CountryVO>();
		Iterable<Country> result = countryRepo.findAll();

		for (Country country : result) {
			
			CountryDetails details = country.getCountryDetails();

			System.out.println(details.getDemonym());

			CountryVO countryVO = new CountryVO(country.getCountryCode(), country.getName(), country.getCapital(),
					country.getRegion(), country.getAlpha2Code(), country.getAlpha3Code(), null);
			
			response.add(countryVO);
		}

		return response;
	}

	@Override
	public void insertCountryDetails(CountryVO countryVO) {

		Country country = new Country();
		country.setCountryCode(countryVO.getCountryCode());
		country.setName(countryVO.getName());
		country.setCapital(countryVO.getCapital());
		country.setRegion(countryVO.getRegion());
		country.setAlpha2Code(countryVO.getAlpha2Code());
		country.setAlpha3Code(countryVO.getAlpha3Code());
		
		CountryDetails countryDetails = new CountryDetails();
		countryDetails.setCountryCode(countryVO.getCountryCode());
		countryDetails.setSubregion(countryVO.getDetails().getSubregion());
		countryDetails.setDemonym(countryVO.getDetails().getDemonym());
		countryDetails.setPopulation(countryVO.getDetails().getPopulation());
		countryDetails.setArea(countryVO.getDetails().getArea());
		countryDetails.setNativeName(countryVO.getDetails().getNativeName());
		
		country.setCountryDetails(countryDetails);
		countryRepo.save(country);
	}

}
