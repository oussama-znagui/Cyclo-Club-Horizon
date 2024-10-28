package ma.znagui.app.service;

import ma.znagui.app.dto.*;

import java.util.List;
import java.util.Optional;

public interface PhaseResultService {
    Optional<PhaseResultDto> findOne(int cyclisteid,int phaseid);

    List<PhaseResultDto> findAll();

    PhaseResultDto create(final PhaseResultCreateDto dto);

    PhaseResultDto addTimeToResult(PhaseResultAddTimeDTO dto);



    void delete(int id);

}
