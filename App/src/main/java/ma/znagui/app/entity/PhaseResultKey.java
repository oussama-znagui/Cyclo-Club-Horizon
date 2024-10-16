package ma.znagui.app.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PhaseResultKey implements Serializable {
    private int phaseId;
    private int cyclisteId;

    public int getphaseId() {
        return phaseId;
    }

    public void setphaseId(int phaseId) {
        this.phaseId = phaseId;
    }

    public int getcyclisteId() {
        return cyclisteId;
    }

    public void setcyclisteId(int cyclisteId) {
        this.cyclisteId = cyclisteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhaseResultKey that = (PhaseResultKey) o;
        return phaseId == that.phaseId && cyclisteId == that.cyclisteId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phaseId, cyclisteId);
    }
}
