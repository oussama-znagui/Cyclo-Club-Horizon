package ma.znagui.app.entity;




import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data


public class Competition implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String title ;
    private String place;
    private int year;
    private LocalDate startDate;
    private LocalDate endDate;
    @OneToMany(mappedBy = "competition")
   private List<GeneralResult> generalResults;

    @OneToMany(mappedBy = "competition")
   private List<Phase> phases;



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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;

    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<GeneralResult> getGeneralResults() {
        return generalResults;
    }

    public void setGeneralResults(List<GeneralResult> generalResults) {
        this.generalResults = generalResults;
    }

    public List<Phase> getPhases() {
        return phases;
    }

    public void setPhases(List<Phase> phases) {
        this.phases = phases;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
