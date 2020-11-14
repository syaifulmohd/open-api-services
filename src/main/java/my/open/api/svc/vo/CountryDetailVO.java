package my.open.api.svc.vo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryDetailVO {
	
	private String subregion;

	private String demonym;

	private long population;

	private float area;

	private String nativeName;

	@JsonCreator
	public CountryDetailVO(@JsonProperty("subregion") String subregion, @JsonProperty("demonym") String demonym,
			@JsonProperty("population") long population, @JsonProperty("area") float area,
			@JsonProperty("nativeName") String nativeName) {
		super();
		this.subregion = subregion;
		this.demonym = demonym;
		this.population = population;
		this.area = area;
		this.nativeName = nativeName;
	}

	public String getSubregion() {
		return subregion;
	}

	public String getDemonym() {
		return demonym;
	}

	public long getPopulation() {
		return population;
	}

	public float getArea() {
		return area;
	}

	public String getNativeName() {
		return nativeName;
	}
	
}
