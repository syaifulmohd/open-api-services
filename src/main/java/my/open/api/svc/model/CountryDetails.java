package my.open.api.svc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "country_details")
public class CountryDetails {
	
	@Id
	@Column(name = "country_code")
	private int countryCode;

	@Column(name = "subregion")
	private String subregion;

	@Column(name = "demonym")
	private String demonym;

	@Column(name = "population")
	private long population;

	@Column(name = "area")
	private float area;

	@Column(name = "native_name")
	private String nativeName;
	
	@OneToOne
    @MapsId
    @JoinColumn(name = "country_code")
	private Country country;
		
	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	public String getDemonym() {
		return demonym;
	}

	public void setDemonym(String demonym) {
		this.demonym = demonym;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public String getNativeName() {
		return nativeName;
	}

	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}

}
