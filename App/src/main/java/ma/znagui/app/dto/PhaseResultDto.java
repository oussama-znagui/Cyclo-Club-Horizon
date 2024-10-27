package ma.znagui.app.dto;

import ma.znagui.app.entity.Cycliste;

import java.time.LocalTime;

public class PhaseResultDto {
    private LocalTime phaseTime;
    private int phaseRang;
    private PhaseDto phase;
    private CyclisteDTO cycliste;

    public LocalTime getPhaseTime() {
        return phaseTime;
    }

    public void setPhaseTime(LocalTime phaseTime) {
        this.phaseTime = phaseTime;
    }

    public int getPhaseRang() {
        return phaseRang;
    }

    public void setPhaseRang(int phaseRang) {
        this.phaseRang = phaseRang;
    }

    public PhaseDto getPhase() {
        return phase;
    }

    public void setPhase(PhaseDto phase) {
        this.phase = phase;
    }

    public CyclisteDTO getCycliste() {
        return cycliste;
    }

    public void setCycliste(CyclisteDTO cycliste) {
        this.cycliste = cycliste;
    }
}
