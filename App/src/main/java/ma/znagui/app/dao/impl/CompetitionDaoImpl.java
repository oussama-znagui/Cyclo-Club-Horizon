package ma.znagui.app.dao.impl;

import ma.znagui.app.dao.CompetitionDao;
import ma.znagui.app.entity.Competition;
import ma.znagui.app.entity.Cycliste;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public class CompetitionDaoImpl extends AbstractHibernateDao<Competition> implements CompetitionDao {
    public CompetitionDaoImpl() {
        super(Competition.class);
    }


    public List<Competition> getCopetitionsFiltredByDate(LocalDate date) {
        Session s = sessionFactory.openSession();
        return s.createQuery("from Competition c where c.startDate =  " + date).list();

    }

    public List<Competition> getCopetitionsFiltredByPlace(String place) {
        Session s = sessionFactory.openSession();

        return s.createQuery("from Competition c where c.place  =" + place).list();

    }

    public List<Competition> getCopetitionsBetween2Date(LocalDate date1, LocalDate date2) {
        return List.of();
    }
}
