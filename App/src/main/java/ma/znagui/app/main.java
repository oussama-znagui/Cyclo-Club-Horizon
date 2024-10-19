package ma.znagui.app;

import ma.znagui.app.dao.CyclisteDao;
import ma.znagui.app.dao.TeamDao;
import ma.znagui.app.dao.impl.CyclisteDaoImpl;
import ma.znagui.app.dao.impl.TeamDaoImpl;
import ma.znagui.app.entity.Competition;
import ma.znagui.app.entity.Cycliste;
import ma.znagui.app.entity.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class main {
    public static void main(String args[]) {


//        System.out.println("bonjour");
//
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
////        Team team = new Team();
//////        team.setId(1);
////        team.setName("ayman");
////        team.setNationality("morocco");
        TeamDao tdao = context.getBean(TeamDaoImpl.class);
        CyclisteDao cdao = context.getBean(CyclisteDaoImpl.class);
//
//        List<Team> teams = tdao.findAll();
//        System.out.println("Number of teams found: " + teams.size());
//        teams.forEach(team1 -> {
//            tdao.delete(team1);
//            System.out.println("Found team ID: " + team1.getId());
//        });
//
////        Team t= new Team();
////        t.setId(2);
////        tdao.delete(t);

//
//        Cycliste cyclist7 = new Cycliste();
//        cyclist7.setFirstName("Arimož");
//        cyclist7.setLastName("Roglič");
//        cyclist7.setAge(34);
//        cyclist7.setTeam(tdao.findOne(959).get());
//        cdao.create(cyclist7);

     


//


    }
}

