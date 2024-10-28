package ma.znagui.app.dao.impl;

import ma.znagui.app.dao.PhaseResultDao;
import ma.znagui.app.entity.PhaseResult;
import ma.znagui.app.entity.PhaseResultKey;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PhaseResultImpl extends AbstractHibernateDao<PhaseResult> implements PhaseResultDao {
    public PhaseResultImpl(){
        super(PhaseResult.class);
    }

    public Optional<PhaseResult> findOne(PhaseResultKey id) {
        Session session = sessionFactory.openSession();
        try {
            return Optional.ofNullable(session.get(PhaseResult.class, id));
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }



}
