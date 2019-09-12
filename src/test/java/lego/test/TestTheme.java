package lego.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lego.Boite;
import lego.Theme;

class TestTheme {

	@Test
	void testThemeConstructor() {
		// given
		var name = "Star Wars";
		// when
		var theme = new Theme(name);
		// then
		assertEquals(name, theme.getName(), "name");
					
	}

}
