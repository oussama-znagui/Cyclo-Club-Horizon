package ma.znagui.app.service;

import ma.znagui.app.dto.CompetitionCreateAndUpdateDTO;
import ma.znagui.app.dto.CompetitionDTO;
import ma.znagui.app.dto.CyclisteCreateAndUpdateDTO;
import ma.znagui.app.dto.CyclisteDTO;
import ma.znagui.app.entity.Competition;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface CompetitionService {

    Optional<CompetitionDTO> findOne(final long id);

    List<CompetitionDTO> findAll();

    CompetitionDTO create(final CompetitionCreateAndUpdateDTO entity);

    CompetitionDTO update(final CyclisteCreateAndUpdateDTO entity,int id);

    void delete(int id);

    public List<CompetitionDTO> getCopetitionsFiltredByDate(LocalDate date);

    public List<CompetitionDTO> getCopetitionsFiltredByPlace(String place);

    public List<CompetitionDTO> getCopetitionsBetween2Date(LocalDate date1,LocalDate date2);
}
