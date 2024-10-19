package ma.znagui.app.dao.impl;

import ma.znagui.app.dao.TeamDao;
import ma.znagui.app.entity.Team;
import org.springframework.stereotype.Repository;

@Repository

public class TeamDaoImpl extends AbstractHibernateDao<Team> implements TeamDao {
    public TeamDaoImpl() {
        super(Team.class);
    }


}

