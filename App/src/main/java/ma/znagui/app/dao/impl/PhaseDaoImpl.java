package ma.znagui.app.dao.impl;

import ma.znagui.app.dao.PhaseDao;
import ma.znagui.app.entity.Phase;
import org.springframework.stereotype.Repository;

@Repository
public class PhaseDaoImpl extends AbstractHibernateDao<Phase> implements PhaseDao {
    public PhaseDaoImpl(){
        super(Phase.class);
    }

}
