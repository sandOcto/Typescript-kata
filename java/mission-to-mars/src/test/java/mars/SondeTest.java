package mars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SondeTest {

	@Test
	void roverDoitEtreRecupere() {
		// Arrange
		Sonde sut = new Sonde();
		ModuleMartien perseverance = new Rover(Direction.NORD, new Position(4, 4, 0));

		// Act
		sut.preparerRecuperation(perseverance);

		// Assert
		assertTrue(perseverance.isPretPourRecuperation());
		assertEquals(new Position(4, 4, 0), perseverance.getPosition());
	}

	@Test
	void helicoptereDoitEtreRecupere() {
		// Arrange
		Sonde sut = new Sonde();
		ModuleMartien ingenuity = new Helicoptere(Direction.NORD, new Position(4, 4, 50));

		// Act
		sut.preparerRecuperation(ingenuity);

		// Assert
		assertTrue(ingenuity.isPretPourRecuperation());
		assertEquals(new Position(4, 4, 0), ingenuity.getPosition());
	}
}
