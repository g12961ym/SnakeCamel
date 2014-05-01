package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {
		@Test
		public void snakeToCamelcaseÇé¿çs() {
			SnakeCamelUtil calc = new SnakeCamelUtil();
			String expected = "HappyBirthDay";
			String actual = calc.snakeToCamelcase("happy_birth_day_ ");
			assertThat(actual, is(expected));
		}
		@Test
		public void camelToSnakecaseÇé¿çs() {
			SnakeCamelUtil calc = new SnakeCamelUtil();
			String expected = "happy_birth_day";
			String actual = calc.camelToSnakecase("HappyBirthDay");
			assertThat(actual, is(expected));
		}	
}

