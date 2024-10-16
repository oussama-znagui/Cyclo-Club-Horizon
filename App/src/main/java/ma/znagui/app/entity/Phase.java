package ma.znagui.app.entity;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.List;
@Entity
public class Phase {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String startLocation;
    private String endLocation;
    private LocalTime startTime;
    @ManyToOne
    @JoinColumn(name = "competition_id",nullable = false)
    private Competition competition;

    @OneToMany(mappedBy = "phase")
    private List<PhaseResult> phaseResults;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public List<PhaseResult> getPhaseResults() {
        return phaseResults;
    }

    public void setPhaseResults(List<PhaseResult> phaseResults) {
        this.phaseResults = phaseResults;
    }
}
