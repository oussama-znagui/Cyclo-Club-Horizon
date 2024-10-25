package ma.znagui.app.mapper;

import ma.znagui.app.dto.TeamDTO;
import ma.znagui.app.entity.Team;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )

public interface TeamMapper {
    TeamDTO teamToTeamDTO(Team t);
}
