package ma.znagui.app.dao.impl;

import ma.znagui.app.dao.CyclisteDao;
import ma.znagui.app.dao.GeneralResultDao;
import ma.znagui.app.entity.Cycliste;
import ma.znagui.app.entity.GeneralResult;
import org.springframework.stereotype.Repository;

@Repository
public class GeneralResultDaoImpl extends AbstractHibernateDao<GeneralResult> implements GeneralResultDao {

    public GeneralResultDaoImpl() {
        super(GeneralResult.class);
    }
}
