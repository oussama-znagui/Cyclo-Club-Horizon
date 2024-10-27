package ma.znagui.app.mapper;

import ma.znagui.app.dao.TeamDao;
import ma.znagui.app.dto.CyclisteCreateAndUpdateDTO;
import ma.znagui.app.dto.CyclisteDTO;
import ma.znagui.app.entity.Cycliste;
import ma.znagui.app.entity.Team;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring" )
public abstract class CyclisteMapper {
    @Autowired
    protected TeamMapper teamMapper;
    @Autowired
    private TeamDao teamDao;

    public abstract CyclisteCreateAndUpdateDTO cyclisteToCreateAndUpdateDTO(Cycliste entity);

    @Mapping(target = "team", expression = "java(getTeam(dto.getTeamID()))")
    public abstract Cycliste createAndUpdateDTOtoCycliste(CyclisteCreateAndUpdateDTO dto);

        @Mapping(target = "team", expression = "java(teamMapper.teamToTeamDTO(c.getTeam()))")
    public abstract CyclisteDTO cyclisteToCyclisteDTO(Cycliste c);


    protected Team getTeam(int id){
        return teamDao.findOne(id).orElseThrow(() -> new RuntimeException("Team not found with id: " + id));


    }
}
