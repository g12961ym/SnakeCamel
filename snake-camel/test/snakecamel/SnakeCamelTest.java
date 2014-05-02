package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {
    	@Test
    	public void capitalize�����s() {
    		String expected = "Happy";
    		String actual = SnakeCamelUtil.capitalize("happy");
    		assertThat(actual, is(expected));
	}    	@Test
	public void capitalize��s�����s() {
		String expected = "";
		String actual = SnakeCamelUtil.capitalize("");
		assertThat(actual, is(expected));
	}
	
	@Test
		public void uncapitalize�����s() {
		String expected = "happy";
			String actual = SnakeCamelUtil.uncapitalize("Happy");
			assertThat(actual, is(expected));
	}		
  		@Test
    	public void uncapitalize��s�����s() {
    		String expected = "";
    		String actual = SnakeCamelUtil.uncapitalize("");
    		assertThat(actual, is(expected));
    }	
		@Test
		public void snakeToCamelcase�����s() {
			SnakeCamelUtil calc = new SnakeCamelUtil();
			String expected = "HappyBirthDay";
			String actual = calc.snakeToCamelcase("_happy_birth_day_ ");
			assertThat(actual, is(expected));
		}
		@Test
		public void camelToSnakecase�����s() {
			SnakeCamelUtil calc = new SnakeCamelUtil();
			String expected = "happy_birth_day";
			String actual = calc.camelToSnakecase("HappyBirthDay");
			assertThat(actual, is(expected));
		}
}

