package test;

abstract class AbstractCountryNormalizer {
	
	private CountryNormalizer nextNormalizer;
	
	protected AbstractCountryNormalizer(CountryNormalizer nextNormalizer) {
		this.nextNormalizer = nextNormalizer;
	}
	
	protected CountryNormalizer nextCountryNormalizer() {
		return nextNormalizer;
	}

}
