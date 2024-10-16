package ma.znagui.app.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GeneralResultKey implements Serializable {
        private int cyclisteId;
        private int competitionId;


    public int getCycliste_id() {
        return cyclisteId;
    }

    public void setCycliste_id(int cycliste_id) {
        this.cyclisteId = cycliste_id;
    }

    public int getCompetition_id() {
        return competitionId;
    }

    public void setCompetition_id(int competition_id) {
        this.competitionId = competition_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralResultKey that = (GeneralResultKey) o;
        return cyclisteId == that.cyclisteId && competitionId == that.competitionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cyclisteId, competitionId);
    }
}
