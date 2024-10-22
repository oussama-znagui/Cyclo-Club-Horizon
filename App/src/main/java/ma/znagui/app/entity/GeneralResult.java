package ma.znagui.app.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalTime;

@Entity
public class GeneralResult implements Serializable {
    @EmbeddedId
    private GeneralResultKey id;
    private LocalTime generalTime;
    private int generalRang;
    @ManyToOne
    @MapsId("competitionId")
    @JoinColumn(name = "competition_id" , nullable = false)
    private Competition competition;

    @ManyToOne
    @MapsId("cyclisteId")
    @JoinColumn(name = "cycliste_id" , nullable = false)
    private Cycliste cycliste;

    public GeneralResultKey getId() {
        return id;
    }

    public void setId(GeneralResultKey id) {
        this.id = id;
    }

    public LocalTime getGeneralTime() {
        return generalTime;
    }

    public void setGeneralTime(LocalTime generalTime) {
        this.generalTime = generalTime;
    }

    public int getGeneralRang() {
        return generalRang;
    }

    public void setGeneralRang(int generalRang) {
        this.generalRang = generalRang;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Cycliste getCycliste() {
        return cycliste;
    }

    public void setCycliste(Cycliste cycliste) {
        this.cycliste = cycliste;
    }
}
