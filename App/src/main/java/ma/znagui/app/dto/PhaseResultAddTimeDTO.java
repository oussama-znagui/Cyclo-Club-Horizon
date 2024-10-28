package ma.znagui.app.dto;

import java.time.LocalTime;

public class PhaseResultAddTimeDTO {
    private int cyclisteID;
    private int phaseID;
    private LocalTime phaseTime;

    public int getCyclisteID() {
        return cyclisteID;
    }

    public void setCyclisteID(int cyclisteID) {
        this.cyclisteID = cyclisteID;
    }

    public int getPhaseID() {
        return phaseID;
    }

    public void setPhaseID(int phaseID) {
        this.phaseID = phaseID;
    }

    public LocalTime getPhaseTime() {
        return phaseTime;
    }

    public void setPhaseTime(LocalTime phaseTime) {
        this.phaseTime = phaseTime;
    }
}
