package ma.znagui.app.service.Impl;

import ma.znagui.app.dao.PhaseResultDao;
import ma.znagui.app.dto.PhaseResultAddTimeDTO;
import ma.znagui.app.dto.PhaseResultCreateDto;
import ma.znagui.app.dto.PhaseResultDto;

import ma.znagui.app.entity.PhaseResult;
import ma.znagui.app.entity.PhaseResultKey;
import ma.znagui.app.exeption.ResourceNotFoundException;
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


    public Optional<PhaseResultDto> findOne(int cyclisteid,int phaseid) {
        PhaseResultKey key = new PhaseResultKey();
        key.setphaseId(phaseid);
        key.setcyclisteId(cyclisteid);
        Optional<PhaseResult> or = dao.findOne(key);

        return or.map(mapper::PhaseResultToDto);
    }

    public List<PhaseResultDto> findAll() {
        List<PhaseResult> results = dao.findAll();
        return results.stream().map(phaseResult -> mapper.PhaseResultToDto(phaseResult)).toList();
    }

    public PhaseResultDto create(PhaseResultCreateDto dto) {
        PhaseResult phaseResult = mapper.createDtoToPhaseResult(dto);

        System.out.println("---------------------------------------------" + phaseResult.getId());

        PhaseResult created = dao.update(phaseResult);
        return mapper.PhaseResultToDto(created);

    }



    public PhaseResultDto addTimeToResult(PhaseResultAddTimeDTO dto) {

        PhaseResult phaseResult = mapper.addTimeDTOtoResult(dto);

     try {
         PhaseResult updated = dao.update(phaseResult);
         return mapper.PhaseResultToDto(updated);
     }catch (ResourceNotFoundException e){
         throw new ResourceNotFoundException("les info sont pas");

     }




    }


    public void delete(int id) {

    }
}
