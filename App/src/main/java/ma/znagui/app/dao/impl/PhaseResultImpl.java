package ma.znagui.app.dao.impl;

import ma.znagui.app.dao.PhaseResultDao;
import ma.znagui.app.entity.PhaseResult;
import org.springframework.stereotype.Repository;

@Repository
public class PhaseResultImpl extends AbstractHibernateDao<PhaseResult> implements PhaseResultDao {
    public PhaseResultImpl(){
        super(PhaseResult.class);
    }


}
