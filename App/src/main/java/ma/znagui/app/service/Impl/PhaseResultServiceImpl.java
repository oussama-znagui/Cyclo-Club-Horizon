package ma.znagui.app.service.Impl;

import ma.znagui.app.dao.PhaseResultDao;
import ma.znagui.app.dto.PhaseResultCreateDto;
import ma.znagui.app.dto.PhaseResultDto;
import ma.znagui.app.entity.PhaseResult;
import ma.znagui.app.mapper.PhaseResultMapper;
import ma.znagui.app.service.PhaseResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PhaseResultServiceImpl implements PhaseResultService {
    @Autowired
    PhaseResultDao dao;
    @Autowired
    PhaseResultMapper mapper;


    public Optional<PhaseResultDto> findOne(long id) {
        return Optional.empty();
    }

    public List<PhaseResultDto> findAll() {
        return List.of();
    }

    public PhaseResultDto create(PhaseResultCreateDto dto) {
        PhaseResult phaseResult = mapper.createDtoToPhaseResult(dto);
        System.out.println("---------------------------------------------" + phaseResult.toString());
        PhaseResult created = dao.create(phaseResult);
        return mapper.PhaseResultToDto(created);
    }

    public void delete(int id) {

    }
}
