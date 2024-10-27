package ma.znagui.app.service;


import ma.znagui.app.dto.PhaseCreateAndUpdateDto;
import ma.znagui.app.dto.PhaseDto;

import java.util.List;
import java.util.Optional;

public interface PhaseService {
    Optional<PhaseDto> findOne(final long id);

    List<PhaseDto> findAll();

    PhaseDto create(final PhaseCreateAndUpdateDto entity);

    PhaseDto update(final PhaseCreateAndUpdateDto entity,int id);

    void delete(int id);
}
