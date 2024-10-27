package ma.znagui.app.mapper;

import ma.znagui.app.dto.CompetitionDTO;
import ma.znagui.app.entity.Competition;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface CompetitionMapper {
    public CompetitionDTO competitionToCompetitionDTO(Competition c);


}
