package ma.znagui.app.mapper;

import ma.znagui.app.dao.CyclisteDao;
import ma.znagui.app.dao.PhaseDao;
import ma.znagui.app.dao.PhaseResultDao;
import ma.znagui.app.dto.PhaseCreateAndUpdateDto;
import ma.znagui.app.dto.PhaseDto;
import ma.znagui.app.dto.PhaseResultCreateDto;
import ma.znagui.app.dto.PhaseResultDto;
import ma.znagui.app.entity.*;
import ma.znagui.app.exeption.ResourceNotFoundException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring" )

public abstract class PhaseResultMapper {
    @Autowired
    PhaseDao phaseDao;
    @Autowired
    CyclisteDao cyclisteDao;
    @Autowired
    PhaseMapper phaseMapper;
    @Autowired
    CyclisteMapper cyclisteMapper;


    @Mappings({
            @Mapping(target = "phase", expression = "java(getPhase(dto.getPhaseID()))"),
            @Mapping(target = "cycliste", expression = "java(getCycliste(dto.getCyclisteID()))"),
            @Mapping(target = "id", expression = "java(createKey(dto))")

    })
    public abstract PhaseResult createDtoToPhaseResult(PhaseResultCreateDto dto);

    @Mappings({
            @Mapping(target = "phase", expression = "java(phaseMapper.phaseToPhaseDTO(phaseResult.getPhase()))"),
            @Mapping(target = "cycliste", expression = "java(cyclisteMapper.cyclisteToCyclisteDTO(phaseResult.getCycliste()))")
    })
    public abstract PhaseResultDto PhaseResultToDto(PhaseResult phaseResult);



    public Phase getPhase(int id){
        return phaseDao.findOne(id).orElseThrow(() -> new ResourceNotFoundException("Competition with ID " + id + " not found"));


    }
    public Cycliste getCycliste(int id){
        return cyclisteDao.findOne(id).orElseThrow(() -> new ResourceNotFoundException("Competition with ID " + id + " not found"));


    }
    protected PhaseResultKey createKey(PhaseResultCreateDto dto) {
        PhaseResultKey key = new PhaseResultKey();
        key.setphaseId(dto.getPhaseID());
        key.setcyclisteId(dto.getCyclisteID());
        return key;
    }




}
