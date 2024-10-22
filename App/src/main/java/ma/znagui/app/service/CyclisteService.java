package ma.znagui.app.service;

import ma.znagui.app.entity.Cycliste;

import java.io.Serializable;
import java.util.List;

public interface CyclisteService extends GenericService<Cycliste>{
    public List<Cycliste> getCyclistsSortedByName();
}
