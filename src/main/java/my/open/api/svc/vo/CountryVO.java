package my.open.api.svc.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int countryCode;

	private String name;

	private String capital;

	private String region;

	private String alpha2Code;

	private String alpha3Code;

	private CountryDetailVO details;

	public CountryVO() {
		super();
	}

	@JsonCreator
	public CountryVO(@JsonProperty("countryCode") int countryCode, @JsonProperty("name") String name,
			@JsonProperty("capital") String capital, @JsonProperty("region") String region,
			@JsonProperty("alpha2Code") String alpha2Code, @JsonProperty("alpha3Code") String alpha3Code,
			CountryDetailVO details) {
		super();
		this.countryCode = countryCode;
		this.name = name;
		this.capital = capital;
		this.region = region;
		this.alpha2Code = alpha2Code;
		this.alpha3Code = alpha3Code;
		this.details = details;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public String getRegion() {
		return region;
	}

	public String getAlpha2Code() {
		return alpha2Code;
	}

	public String getAlpha3Code() {
		return alpha3Code;
	}

	public CountryDetailVO getDetails() {
		return details;
	}

}
