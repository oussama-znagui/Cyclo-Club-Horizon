package ma.znagui.app.mapper;

import ma.znagui.app.dao.CompetitionDao;
import ma.znagui.app.dao.TeamDao;
import ma.znagui.app.dto.CompetitionDTO;
import ma.znagui.app.dto.CyclisteCreateAndUpdateDTO;
import ma.znagui.app.dto.PhaseCreateAndUpdateDto;
import ma.znagui.app.dto.PhaseDto;
import ma.znagui.app.entity.Competition;
import ma.znagui.app.entity.Phase;
import ma.znagui.app.exeption.ResourceNotFoundException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring" )
public abstract class PhaseMapper {
    @Autowired
    private CompetitionDao cDao;

    @Autowired
    CompetitionMapper mapper;

    @Mapping(target = "competition", expression = "java(getCompetition(dto.getCompetitionID()))")
    public abstract Phase createAndUpdateDtoToPhase(PhaseCreateAndUpdateDto dto);

    @Mapping(target = "competition", expression = "java(mapper.competitionToCompetitionDTO(phase.getCompetition()))")
    public abstract PhaseDto phaseToPhaseDTO(Phase phase );


    public Competition getCompetition(int id){
        return cDao.findOne(id).orElseThrow(() -> new ResourceNotFoundException("Competition with ID " + id + " not found"));


    }
    
}
