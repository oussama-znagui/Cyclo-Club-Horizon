package ma.znagui.app.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
@Entity
public class Team implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String nationality;

    @OneToMany(mappedBy = "team",fetch = FetchType.EAGER)
    private List<Cycliste> cyclistes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<Cycliste> getCyclistes() {
        return cyclistes;
    }

    public void setCyclistes(List<Cycliste> cyclistes) {
        this.cyclistes = cyclistes;
    }
}
