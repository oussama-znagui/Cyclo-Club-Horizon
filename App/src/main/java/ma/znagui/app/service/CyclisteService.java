package ma.znagui.app.service;

import ma.znagui.app.dto.CyclisteCreateAndUpdateDTO;
import ma.znagui.app.dto.CyclisteDTO;
import ma.znagui.app.entity.Cycliste;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface CyclisteService {

    Optional<CyclisteDTO> findOne(final long id);

    List<CyclisteDTO> findAll();

    CyclisteDTO create(final CyclisteCreateAndUpdateDTO entity);

    CyclisteDTO update(final CyclisteCreateAndUpdateDTO entity,int id);

    void delete(int id);

    public List<CyclisteDTO> getCyclistsSortedByName();
}
