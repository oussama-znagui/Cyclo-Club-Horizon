package ma.znagui.app.dao;

import ma.znagui.app.entity.Cycliste;

import java.util.List;

public interface CyclisteDao extends GenericDao<Cycliste>{
    public List<Cycliste> getCyclistsSortedByName();
}
