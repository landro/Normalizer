package test;

public class NorwegianCountryNameNormalizer extends AbstractCountryNormalizer implements CountryNormalizer{
	
	protected NorwegianCountryNameNormalizer(CountryNormalizer nextNormalizer) {
		super(nextNormalizer);
	}

	public String normalize(String country) {
		if (country.equals("Norge")) {
			return "NO";
		}
	
		return nextCountryNormalizer().normalize(country);

	}

}
