package test;

public class EnglishCountryNameNormalizer extends AbstractCountryNormalizer implements CountryNormalizer{
	
	protected EnglishCountryNameNormalizer(CountryNormalizer nextNormalizer) {
		super(nextNormalizer);
	}

	public String normalize(String country) {
		if (country.equals("Norway")) {
			return "NO";
		}
	
		return nextCountryNormalizer().normalize(country);

	}

}
