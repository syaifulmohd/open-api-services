package my.open.api.svc.controller;

import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CountriesController {
	
	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(CountriesController.class);

	@RequestMapping(path = "countries", method = RequestMethod.GET)
	private ResponseEntity<String> fetchCountriesDetails() {		
		logger.info("Enter controller: fetchCountriesDetails");

		return null;
	}

	@RequestMapping(path = "countries", method = RequestMethod.POST)
	private ResponseEntity<String> addCountries(@RequestParam(name = "user") String user) {		
		logger.info("Enter controller: addCountries, with user: {}", user);
		
		return null;
	}

}
