package test;

public class Normalizer {

	private static CountryNormalizer countryNormalizer = new EnglishCountryNameNormalizer(
			new NorwegianCountryNameNormalizer(new FinalCountryNormalizer()));

	public static String nomalize(String country) {
		return countryNormalizer.normalize(country);
	}

}
