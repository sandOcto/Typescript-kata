using NUnit.Framework;
using mission_to_mars;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Shouldly;

namespace mission_to_mars.Tests
{

    [TestFixture()]
    public class SondeTests
    {
        private Sonde sut;

        [Test()]
        public void RoverDoitEtreRecuperer()
        {
            // Arrange
            sut = new Sonde();
            IModuleMartien perseverance = new Rover(Direction.NORD, new Position(4, 4, 0));

            // Act
            sut.PreparerRécupération(perseverance);

            //Assert
            perseverance.IsPretPourRecuperation.ShouldBe(true);
            perseverance.Position.ShouldBe(new Position(4, 4, 0), "Récupérer perseverance ne doit pas changer sa position");

        }

        [Test()]
        public void HelicoptereDoitEtreRecupéré()
        {
            // Arrange
            sut = new Sonde();
            IModuleMartien ingenuity = new Helicoptere(Direction.NORD, new Position(4, 4, 50));

            // Act
            sut.PreparerRécupération(ingenuity);

            //Assert
            ingenuity.IsPretPourRecuperation.ShouldBe(true);
            ingenuity.Position.ShouldBe(new Position(4, 4, 0), "Récupérer ingenuity implique de le faire attérir");

        }
    }
}
