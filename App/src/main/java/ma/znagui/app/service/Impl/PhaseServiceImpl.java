package ma.znagui.app.service.Impl;

import ma.znagui.app.dao.CompetitionDao;
import ma.znagui.app.dao.PhaseDao;
import ma.znagui.app.dto.PhaseCreateAndUpdateDto;
import ma.znagui.app.dto.PhaseDto;
import ma.znagui.app.entity.Phase;
import ma.znagui.app.mapper.CompetitionMapper;
import ma.znagui.app.mapper.PhaseMapper;
import ma.znagui.app.service.PhaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PhaseServiceImpl implements PhaseService {
    @Autowired
    PhaseDao dao;
    @Autowired
    PhaseMapper mapper;
    public Optional<PhaseDto> findOne(long id) {
        return Optional.empty();
    }

    public List<PhaseDto> findAll() {
        return List.of();
    }

    public PhaseDto create(PhaseCreateAndUpdateDto dto) {
        Phase phase = mapper.createAndUpdateDtoToPhase(dto);
        Phase created = dao.create(phase);
        System.out.println("from service" + created.getTitle() + created.getCompetition().getTitle());
        return mapper.phaseToPhaseDTO(created);

    }

    public PhaseDto update(PhaseCreateAndUpdateDto entity, int id) {
        return null;
    }

    public void delete(int id) {

    }
}
