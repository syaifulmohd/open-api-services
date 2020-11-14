package my.open.api.svc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@Column(name = "country_code")
	private int countryCode;

	@Column(name = "name")
	private String name;

	@Column(name = "capital")
	private String capital;

	@Column(name = "region")
	private String region;

	@Column(name = "alpha2_code")
	private String alpha2Code;

	@Column(name = "alpha3_code")
	private String alpha3Code;

	@OneToOne(mappedBy = "country", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
	private CountryDetails countryDetails;

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAlpha2Code() {
		return alpha2Code;
	}

	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}

	public String getAlpha3Code() {
		return alpha3Code;
	}

	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}

	public CountryDetails getCountryDetails() {
		return countryDetails;
	}

	public void setCountryDetails(CountryDetails countryDetails) {
		this.countryDetails = countryDetails;
	}

}
