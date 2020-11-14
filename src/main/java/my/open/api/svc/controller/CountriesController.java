package my.open.api.svc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import my.open.api.svc.services.CountryService;
import my.open.api.svc.vo.CountryVO;

@RestController
public class CountriesController {
	
	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(CountriesController.class);
	
	@Autowired
	private CountryService countryService;

	@RequestMapping(path = "countries", method = RequestMethod.GET)
	private ResponseEntity<List<CountryVO>> fetchCountryList() {		
		logger.info("Enter controller: fetchCountryList");		
		List<CountryVO> response = countryService.fetchCountryInformationList();

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@RequestMapping(path = "add/country", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	private void addCountry(@RequestBody CountryVO countryVO) {		
		logger.info("Enter controller: addCountry, with country name: {}", countryVO.getName());
		
		countryService.insertCountryDetails(countryVO);
	}

}
