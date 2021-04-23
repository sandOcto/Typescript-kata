package mars;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class HelicoptereTest {

	ModuleMartien sut;

	@Test
	void initialisationAtterissage() {
		// Arrange
		sut = new Helicoptere(Direction.NORD, new Position(4, 4, 0));

		// Assert
		assertTrue(new Position(4, 4, 0).equals(sut.getPosition()));
	}

	@Test
	void doitAvancer1CaseVersNordSiTourneVersLeNord() {
		// Arrange
		sut = new Helicoptere(Direction.NORD, new Position(4, 4, 1));

		// Act
		sut.avancer();

		// Assert
		assertTrue(new Position(4, 5, 1).equals(sut.getPosition()));
	}

	@Test
	void doitAvancer1CaseVersSudSiTourneVersLeSud() {
		// Arrange
		sut = new Helicoptere(Direction.SUD, new Position(4, 4, 1));

		// Act
		sut.avancer();

		// Assert
		assertEquals(new Position(4, 3, 1), sut.getPosition());
	}

	@Test
	void doitAvancer1CaseVersOuestSiTourneVersLOuest() {
		// Arrange
		sut = new Helicoptere(Direction.OUEST, new Position(4, 4, 1));

		// Act
		sut.avancer();

		// Assert
		assertEquals(new Position(3, 4, 1), sut.getPosition());
	}

	@Test
	void roverDoitReculer1CaseVersNordSiTourneVersLeNord() {
		// Arrange
		sut = new Helicoptere(Direction.NORD, new Position(4, 4, 1));

		// Act
		sut.reculer();

		// Assert
		assertTrue(new Position(4, 3, 1).equals(sut.getPosition()));
	}

	@Test
	void doitReculer1CaseVersSudSiTourneVersLeSud() {
		// Arrange
		sut = new Helicoptere(Direction.SUD, new Position(4, 4, 1));

		// Act
		sut.reculer();

		// Assert
		assertEquals(new Position(4, 5, 1), sut.getPosition());
	}

	@Test
	void doitReculer1CaseVersOuestSiTourneVersLOuest() {
		// Arrange
		sut = new Helicoptere(Direction.OUEST, new Position(4, 4, 1));

		// Act
		sut.reculer();

		// Assert
		assertEquals(new Position(5, 4, 1), sut.getPosition());
	}

	@Test
	void doitReculer1CaseVersEstSiTourneVersLEst() {
		// Arrange
		sut = new Helicoptere(Direction.EST, new Position(4, 4, 1));

		// Act
		sut.reculer();

		// Assert
		assertEquals(new Position(3, 4, 1), sut.getPosition());
	}

	@Test
	void doitMonter1CaseVersLeHaut() {
		// Arrange
		sut = new Helicoptere(Direction.EST, new Position(4, 4, 0));

		// Act
		sut.monter();

		// Assert
		assertEquals(new Position(4, 4, 1), sut.getPosition());
	}

	@Test
	void doitDescendre1CaseVersLeBas() {
		// Arrange
		sut = new Helicoptere(Direction.EST, new Position(4, 4, 3));

		// Act
		sut.descendre();

		// Assert
		assertEquals(new Position(4, 4, 2), sut.getPosition());
	}

}
