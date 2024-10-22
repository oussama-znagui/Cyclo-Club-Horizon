package ma.znagui.app.dao;

import ma.znagui.app.entity.Competition;

import java.time.LocalDate;
import java.util.List;

public interface CompetitionDao extends GenericDao<Competition>{
    public List<Competition> getCopetitionsFiltredByDate(LocalDate date);
    public List<Competition> getCopetitionsFiltredByPlace(String place);
    public List<Competition> getCopetitionsBetween2Date(LocalDate date1,LocalDate date2);

}
