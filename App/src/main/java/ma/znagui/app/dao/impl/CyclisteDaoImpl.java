package ma.znagui.app.dao.impl;

import ma.znagui.app.dao.CyclisteDao;
import ma.znagui.app.entity.Cycliste;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CyclisteDaoImpl extends AbstractHibernateDao<Cycliste> implements CyclisteDao {

    public CyclisteDaoImpl() {
        super(Cycliste.class);
    }

    public List getCyclistsSortedByName() {
        Session s = sessionFactory.openSession();
        return s.createQuery("from Cycliste c ORDER BY c.firstName").list();
    }
}
