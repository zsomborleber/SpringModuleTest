package app.models;

import javax.persistence.*;

/**
 * Model for ships' crew members.
 *
 * ATTENTION!
 * Any changes of this class may make it impossible to run the program,
 * since it is in active use.
 * Better not to touch it.
 *
 * (See app.helpers.ShipData for more details.)
 */
@Entity
public class Crew {

    @Id
    @GeneratedValue
    private long id;

    private String crewName;

    @Enumerated(EnumType.STRING)
    private Rank crewRank;

    @ManyToOne
    private SpaceShip dutyShip;

    public Crew() {}

    public Crew(String crewName, Rank crewRank) {
        this.crewName = crewName;
        this.crewRank = crewRank;
    }

    public Crew(long id, String crewName, Rank crewRank, SpaceShip dutyShip) {
        this(crewName, crewRank);
        this.id = id;
        this.dutyShip = dutyShip;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCrewName() {
        return crewName;
    }

    public void setCrewName(String firstname) {
        this.crewName = firstname;
    }

    public Rank getCrewRank() {
        return crewRank;
    }

    public void setCrewRank(Rank rank) {
        this.crewRank = rank;
    }

    public SpaceShip getDutyShip() {
        return dutyShip;
    }

    public void setDutyShip(SpaceShip dutyShip) {
        this.dutyShip = dutyShip;
    }

}
