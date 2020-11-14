package my.open.api.svc.services;

import java.util.List;

import my.open.api.svc.vo.CountryVO;

public interface CountryService {
	
	public List<CountryVO> fetchCountryInformationList();
	
	public void insertCountryDetails(CountryVO countryVO);

}
