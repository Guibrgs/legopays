package lego.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lego.Boite;

class TestBoite {

	@Test
	void testBoiteConstructor() {
		// given
		var number = 21318;
		var name = "La cabane dans l'arbre";
		var pieces = 325;
		var figurines = 59;
		var price = 10999;
		// when
		var boite = new Boite(number, name, pieces, figurines, price);
		// then
		assertAll(
				() -> assertEquals(number, boite.getNumber(), "number"),
				() -> assertEquals(name, boite.getName(), "name"),
				() -> assertEquals(pieces, boite.getPieces(), "pieces"),
				() -> assertEquals(figurines, boite.getFigurines(), "figurines"),
				() -> assertEquals(price, boite.getPrice(), "price")
			);
		
	}
	
	
}
