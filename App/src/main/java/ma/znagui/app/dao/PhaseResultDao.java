package ma.znagui.app.dao;

import ma.znagui.app.entity.PhaseResult;
import ma.znagui.app.entity.PhaseResultKey;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface PhaseResultDao extends GenericDao<PhaseResult> {
    public Optional<PhaseResult> findOne(PhaseResultKey id);



}
