package app.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRIES")
public class Country {

	@Id
	@Column(name = "COUNTRY_ID")
	public String countryId;

	@Column(name = "COUNTRY_NAME")
	public String countryName;

	@Column(name = "REGION_ID")
	public int regionId;

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s", countryId, countryName, regionId);
	}

}
