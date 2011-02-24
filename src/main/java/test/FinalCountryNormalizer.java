package test;

public class FinalCountryNormalizer implements CountryNormalizer{

	public String normalize(String country) {
		
		throw new RuntimeException("Couldn't normalize " + country );
	}

}
