package ma.znagui.app.entity;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class PhaseResult {
    @EmbeddedId
    private PhaseResultKey id;
    private LocalTime phaseTime;
    private int phaseRang;

    @ManyToOne
    @MapsId("phaseId")
    @JoinColumn(name = "phase_id" , nullable = false)
    private Phase phase;


    @ManyToOne
    @MapsId("cyclisteId")
    @JoinColumn(name = "cycliste_id" , nullable = false)
    private Cycliste cycliste;


    public Cycliste getCycliste() {
        return cycliste;
    }

    public void setCycliste(Cycliste cycliste) {
        this.cycliste = cycliste;
    }

    public Phase getPhase() {
        return phase;
    }

    public void setPhase(Phase phase) {
        this.phase = phase;
    }

    public int getPhaseRang() {
        return phaseRang;
    }

    public void setPhaseRang(int phaseRang) {
        this.phaseRang = phaseRang;
    }

    public LocalTime getPhaseTime() {
        return phaseTime;
    }

    public void setPhaseTime(LocalTime phaseTime) {
        this.phaseTime = phaseTime;
    }

    public PhaseResultKey getId() {
        return id;
    }

    public void setId(PhaseResultKey id) {
        this.id = id;
    }



}
