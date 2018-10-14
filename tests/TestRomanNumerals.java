import static org.junit.Assert.*;
import org.junit.Test;

public class TestRomanNumerals {
	@Test
	public void testUnitExpression() {
		String roman = "VI";
		RomanNumerals rn = new RomanNumerals();
		assertEquals("Unit conversion fails", 6, rn.convertToInteger(roman));

	}

	@Test
	public void testTenExpression() {
		String roman = "XII";
		RomanNumerals rn = new RomanNumerals();
		assertEquals("Ten conversion fails", 12, rn.convertToInteger(roman));

	}

	@Test
	public void testHunderedExpression() {
		String roman = "CII";
		RomanNumerals rn = new RomanNumerals();
		assertEquals("Hundered conversion fails", 102, rn.convertToInteger(roman));

	}

	@Test
	public void testThousandExpression() {
		String roman = "MCMLXXXIV";
		RomanNumerals rn = new RomanNumerals();
		assertEquals("Thousand conversion fails", 1984, rn.convertToInteger(roman));

	}

}
