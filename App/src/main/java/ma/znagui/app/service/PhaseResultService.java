package ma.znagui.app.service;

import ma.znagui.app.dto.PhaseCreateAndUpdateDto;
import ma.znagui.app.dto.PhaseDto;
import ma.znagui.app.dto.PhaseResultCreateDto;
import ma.znagui.app.dto.PhaseResultDto;

import java.util.List;
import java.util.Optional;

public interface PhaseResultService {
    Optional<PhaseResultDto> findOne(final long id);

    List<PhaseResultDto> findAll();

    PhaseResultDto create(final PhaseResultCreateDto dto);



    void delete(int id);

}
