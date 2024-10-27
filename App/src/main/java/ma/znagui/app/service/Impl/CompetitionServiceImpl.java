package ma.znagui.app.service.Impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import ma.znagui.app.dao.CompetitionDao;
import ma.znagui.app.dto.CompetitionCreateAndUpdateDTO;
import ma.znagui.app.dto.CompetitionDTO;
import ma.znagui.app.dto.CyclisteCreateAndUpdateDTO;
import ma.znagui.app.entity.Competition;
import ma.znagui.app.mapper.CompetitionMapper;
import ma.znagui.app.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Service
public class CompetitionServiceImpl implements CompetitionService {

@Autowired
CompetitionDao dao;
@Autowired
CompetitionMapper mapper;

    ObjectMapper om = new ObjectMapper();


    public Optional<CompetitionDTO> findOne(long id) {
        Optional<Competition> oc = dao.findOne(id);
        return oc.map(mapper::competitionToCompetitionDTO);
    }

    public List<CompetitionDTO> findAll() {
        return dao.findAll().stream().map(competition -> mapper.competitionToCompetitionDTO(competition)).toList();
//        return List.of();
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
