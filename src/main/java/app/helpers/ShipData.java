package app.helpers;

import app.models.Crew;
import app.models.Rank;
import app.models.SpaceShip;
import app.models.SpaceShipClass;
import org.springframework.stereotype.Component;

/**
 * DO NOT TOUCH!
 *
 * This class contains the test data.
 * Viewing and interpreting it is not compulsory,
 * but bored "gunters" (egg hunters) may enjoy it.
 */
@Component
public class ShipData {

    public String titanic() {
        return "Titanic";
    }

    public SpaceShip titanicShip() {
        return new SpaceShip(SpaceShipClass.INTREPID, titanic(), false);
    }

    public Crew[] titanicCrews() {
        return new Crew[] {
                new Crew("Edward John Smith", Rank.CAPTAIN),
                new Crew("Jack Dawson", Rank.ENSIGN),
                new Crew("Rose Bukater", Rank.ENSIGN)
        };
    }

    public String sevenUp() {
        return "7up";
    }

    public SpaceShip sevenUpShip() {
        return new SpaceShip(SpaceShipClass.INTREPID, sevenUp(), false);
    }

    public Crew[] sevenUpCrews() {
        return new Crew[] {
                new Crew("Anna Nacho", Rank.CAPTAIN),
                new Crew("Hunagi", Rank.COMMANDER)
        };
    }

    public String babyDoll() {
        return "Baby Doll";
    }

    public SpaceShip babyDollShip() {
        return new SpaceShip(SpaceShipClass.INTREPID, babyDoll(), true);
    }

    public String woodenHorse() {
        return "Wooden Horse";
    }

    public SpaceShip woodenHorseShip() {
        return new SpaceShip(SpaceShipClass.NOVA, woodenHorse(), false);
    }

    public Crew[] woodenHorseCrews() {
        return new Crew[] {
                new Crew("Odysseus", Rank.CAPTAIN),
                new Crew("Epeios", Rank.COMMANDER),
                new Crew("Sinon", Rank.COMMANDER),
                new Crew("Greek soldier 1", Rank.ENSIGN),
                new Crew("Greek soldier 2", Rank.ENSIGN),
                new Crew("Greek soldier 3", Rank.ENSIGN)
        };
    }

    public String waveRider() {
        return "Wave Rider";
    }

    public SpaceShip waveRiderShip() {
        return new SpaceShip(SpaceShipClass.NOVA, waveRider(), true);
    }

    public Crew[] waveRiderCrews() {
        return new Crew[] {
                new Crew("Rip Hunter", Rank.CAPTAIN),
                new Crew("Sara Lance", Rank.CAPTAIN),
                new Crew("Gideon", Rank.COMMANDER),
                new Crew("Ray Palmer", Rank.LIEUTENANT),
                new Crew("Dr. Martin Stein", Rank.LIEUTENANT),
                new Crew("Jefferson Jackson", Rank.LIEUTENANT),
                new Crew("Mick Rory", Rank.LIEUTENANT),
                new Crew("Kendra Saunders", Rank.ENSIGN),
                new Crew("Carter Hall", Rank.ENSIGN),
                new Crew("Leonard Snart", Rank.ENSIGN)
        };
    }

    public String nautilus() {
        return "Nautilus";
    }

    public SpaceShip nautilusShip() {
        return new SpaceShip(SpaceShipClass.NOVA, nautilus(), true);
    }

    public Crew[] nautilusCrews() {
        return new Crew[] {
                new Crew("Jules Verne", Rank.CAPTAIN),
                new Crew("Nemo", Rank.CAPTAIN)
        };
    }

    public String blackPearl() {
        return "Black Pearl";
    }

    public SpaceShip blackPearlShip() {
        return new SpaceShip(SpaceShipClass.RAVEN, blackPearl(), false);
    }

    public Crew[] blackPearlCrews() {
        return new Crew[] {
                new Crew("Jack Sparrow", Rank.CAPTAIN),
                new Crew("Anonymous Pirate", Rank.CADET)
        };
    }

    public String stormrage() {
        return "Stormrage";
    }

    public SpaceShip stormrageShip() {
        return new SpaceShip(SpaceShipClass.RAVEN, stormrage(), true);
    }

    public Crew[] stormrageCrews() {
        return new Crew[] {
                new Crew("Illidan", Rank.CAPTAIN),
                new Crew("Malfurion", Rank.CADET),
                new Crew("Tyrande", Rank.CADET)
        };
    }

    public  String pequod() {
        return "Pequod";
    }

    public SpaceShip pequodShip() {
        return new SpaceShip(SpaceShipClass.RAVEN, pequod(), true);
    }

    public Crew[] pequodCrews() {
        return new Crew[] {
                new Crew("Herman Melville", Rank.CAPTAIN),
                new Crew("Ahab", Rank.CAPTAIN)
        };
    }

    public String theCube() {
        return "The Cube";
    }

    public SpaceShip theCubeShip() {
        return new SpaceShip(SpaceShipClass.GALAXY, theCube(), false);
    }

    public Crew[] theCubeCrews() {
        return new Crew[] {
                new Crew("Queen of the Borg", Rank.CAPTAIN),
                new Crew("One of Nine", Rank.ENSIGN),
                new Crew("Two of Nine", Rank.ENSIGN),
                new Crew("Three of Nine", Rank.ENSIGN),
                new Crew("Four of Nine", Rank.ENSIGN),
                new Crew("Five of Nine", Rank.ENSIGN),
                new Crew("Six of Nine", Rank.ENSIGN),
                new Crew("Seven of Nine", Rank.ENSIGN),
                new Crew("Eight of Nine", Rank.ENSIGN),
                new Crew("Nine of Nine", Rank.ENSIGN)
        };
    }

    public String enterprise() {
        return "Enterprise";
    }

    public SpaceShip enterpriseShip() {
        return new SpaceShip(SpaceShipClass.GALAXY, enterprise(), true);
    }

    public Crew[] enterpriseCrews() {
        return new Crew[] {
                new Crew("Jean-Luc Picard", Rank.CAPTAIN),
                new Crew("William T. Riker", Rank.COMMANDER),
                new Crew("Data", Rank.COMMANDER),
                new Crew("Tasha Yar", Rank.LIEUTENANT),
                new Crew("Worf", Rank.LIEUTENANT),
                new Crew("Geordi La Forge", Rank.LIEUTENANT),
                new Crew("Beverly Crusher", Rank.LIEUTENANT),
                new Crew("Deanna Troi", Rank.LIEUTENANT),
                new Crew("Wesley Crusher", Rank.CADET)
        };
    }

    public String theOak() {
        return "The Oak";
    }

    public SpaceShip theOakShip() {
        return new SpaceShip(SpaceShipClass.GALAXY, theOak(), true);
    }

    public Crew[] theOakCrews() {
        return new Crew[] {
                new Crew("Thorin", Rank.CAPTAIN),
                new Crew("Gandalf", Rank.COMMANDER),
                new Crew("Balin", Rank.COMMANDER),
                new Crew("Dwalin", Rank.LIEUTENANT),
                new Crew("Bifur", Rank.LIEUTENANT),
                new Crew("Bilbo", Rank.ENSIGN)
        };
    }

    public String tardis() {
        return "T.A.R.D.I.S.";
    }

    public SpaceShip tardisShip() {
        return new SpaceShip(SpaceShipClass.GALAXY, tardis(), true);
    }

    public Crew[] tardisCrews() {
        return new Crew[] {
                new Crew("?", Rank.CAPTAIN),
                new Crew("Rose Tyler", Rank.CADET),
                new Crew("Martha Jones", Rank.CADET),
                new Crew("Donna Noble", Rank.CADET),
                new Crew("Sarah Jane Smith", Rank.CADET),
                new Crew("Amelia Pond", Rank.CADET),
                new Crew("Clara Oswald", Rank.CADET),
                new Crew("Melody Pond", Rank.CADET),
                new Crew("River Song", Rank.CADET)
        };
    }

    public String rex() {
        return "Rex";
    }

    public SpaceShip rexShip() {
        return new SpaceShip(SpaceShipClass.DREADNOUGHT, rex(), false);
    }

    public Crew rexCrew() {
        return new Crew("Peter Haas Vander", Rank.CAPTAIN);
    }

    public String theEngineer() {
        return "The Engineer";
    }

    public SpaceShip theEngineerShip() {
        return new SpaceShip(SpaceShipClass.DREADNOUGHT, theEngineer(), false);
    }

    public Crew theEngineerCrew() {
        return new Crew("Father Andrew", Rank.ADMIRAL);
    }

}
