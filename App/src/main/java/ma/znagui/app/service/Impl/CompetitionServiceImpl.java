package ma.znagui.app.service.Impl;

import ma.znagui.app.dto.CompetitionCreateAndUpdateDTO;
import ma.znagui.app.dto.CompetitionDTO;
import ma.znagui.app.dto.CyclisteCreateAndUpdateDTO;
import ma.znagui.app.service.CompetitionService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class CompetitionServiceImpl implements CompetitionService {



    public Optional<CompetitionDTO> findOne(long id) {
        return Optional.empty();
    }

    public List<CompetitionDTO> findAll() {
        return List.of();
    }

    public CompetitionDTO create(CompetitionCreateAndUpdateDTO entity) {
        return null;
    }

    public CompetitionDTO update(CyclisteCreateAndUpdateDTO entity, int id) {
        return null;
    }

    public void delete(int id) {

    }

    public List<CompetitionDTO> getCopetitionsFiltredByDate(LocalDate date) {
        return List.of();
    }

    public List<CompetitionDTO> getCopetitionsFiltredByPlace(String place) {
        return List.of();
    }

    public List<CompetitionDTO> getCopetitionsBetween2Date(LocalDate date1, LocalDate date2) {
        return List.of();
    }
}
