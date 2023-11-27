from src.mars.Direction import Direction
from src.mars.Helicoptere import Helicoptere
from src.mars.Position import Position
from src.mars.Rover import Rover
from src.mars.Sonde import Sonde


class TestSonde:

    def test_rover_doit_etre_recupere(self):
        # Arrange
        sut = Sonde()
        perseverance = Rover(Direction.NORD, Position(4, 4, 0))

        # Act
        sut.preparer_recuperation(perseverance)

        # Assert
        assert perseverance.is_pret_pour_recuperation() is True
        assert Position(4, 4, 0) == perseverance.get_position()

    def test_helicoptere_doit_etre_recupere(self):
        # Arrange
        sut = Sonde()
        ingenuity = Helicoptere(Direction.NORD, Position(4, 4, 50))

        # Act
        sut.preparer_recuperation(ingenuity)

        # Assert
        assert ingenuity.is_pret_pour_recuperation() is True
        assert Position(4, 4, 0) == ingenuity.get_position()
