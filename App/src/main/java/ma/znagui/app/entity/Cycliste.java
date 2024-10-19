package ma.znagui.app.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
@Entity
public class Cycliste implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    @OneToMany(mappedBy = "cycliste")
    private List<GeneralResult> generalResults;

    @OneToMany(mappedBy = "cycliste")
    private List<PhaseResult> phaseResults;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<GeneralResult> getGeneralResults() {
        return generalResults;
    }

    public void setGeneralResults(List<GeneralResult> generalResults) {
        this.generalResults = generalResults;
    }

    public List<PhaseResult> getPhaseResults() {
        return phaseResults;
    }

    public void setPhaseResults(List<PhaseResult> phaseResults) {
        this.phaseResults = phaseResults;
    }
}
