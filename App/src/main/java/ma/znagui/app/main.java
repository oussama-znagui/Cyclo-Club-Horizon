package ma.znagui.app;

import ma.znagui.app.dao.CompetitionDao;
import ma.znagui.app.dao.CyclisteDao;
import ma.znagui.app.dao.GeneralResultDao;
import ma.znagui.app.dao.TeamDao;
import ma.znagui.app.dao.impl.CompetitionDaoImpl;
import ma.znagui.app.dao.impl.CyclisteDaoImpl;
import ma.znagui.app.dao.impl.GeneralResultDaoImpl;
import ma.znagui.app.dao.impl.TeamDaoImpl;
import ma.znagui.app.entity.Competition;
import ma.znagui.app.entity.Cycliste;
import ma.znagui.app.entity.GeneralResult;
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

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class main {
    public static void main(String args[]) {


//        System.out.println("bonjour");
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
////        Team team = new Team();
//////        team.setId(1);
////        team.setName("ayman");
////        team.setNationality("morocco");
//        TeamDao tdao = context.getBean(TeamDaoImpl.class);
//        CyclisteDao cdao = context.getBean(CyclisteDaoImpl.class);
//        CompetitionDao cmdao = context.getBean(CompetitionDaoImpl.class);
//        GeneralResultDao gndao = context.getBean(GeneralResultDaoImpl.class);
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
//        Optional<Cycliste> oc = cdao.findOne(2);
//        Cycliste c = oc.get();
//
//        Competition cm = new Competition();
//        cm.setEndDate(LocalDate.parse("2025-01-31"));
//        cm.setTitle("Tour Du France");
//        cm.setPlace("France");
//        cm.setStartDate(LocalDate.parse("2025-01-01"));
//        cm.setYear(2025);
//        cm = cmdao.create(cm);
//        GeneralResult gn = new GeneralResult();
//        gn.setCompetition(cm);
//        gn.setCycliste(c);
//
//        gndao.create(gn);


        // Créer et configurer le WebApplicationContext à partir du fichier XML


//
//        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(8080);

        // Créer le contexte de l'application





//


    }
}

