package test;

import  test.Normalizer;
import junit.framework.TestCase;

public class NormalizerTest extends TestCase {

	public void testNormalizerCanHandleEnglishCountryNames() {
		assertEquals("NO", Normalizer.nomalize("Norway"));
	}

	public void testNormalizerCanHandleNorwegianCountryNames() {
		assertEquals("NO", Normalizer.nomalize("Norge"));
	}

	public void testNormalizerCantHandleFrenchCountryNames() {
		try {
			Normalizer.nomalize("Norvège");
			fail("Should not be able to conver French country names");
		} catch (RuntimeException e) {
			assertTrue(true);
		}
	}

}
