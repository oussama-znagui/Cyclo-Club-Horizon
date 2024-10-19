package ma.znagui.app;

import ma.znagui.app.dao.TeamDao;
import ma.znagui.app.dao.impl.TeamDaoImpl;
import ma.znagui.app.entity.Competition;
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
    public static void main(String args[]){


//        System.out.println("bonjour");
//
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
////        Team team = new Team();
//////        team.setId(1);
////        team.setName("ayman");
////        team.setNationality("morocco");
        TeamDao tdao = context.getBean(TeamDaoImpl.class);
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


        Team team1 = new Team();
        team1.setName("Team INEOS");
        team1.setNationality("Royaume-Uni");

        Team team2 = new Team();
        team2.setName("Jumbo-Visma");
        team2.setNationality("Pays-Bas");

        Team team3 = new Team();
        team3.setName("UAE Team Emirates");
        team3.setNationality("Émirats Arabes Unis");

        Team team4 = new Team();
        team4.setName("Movistar Team");
        team4.setNationality("Espagne");

        Team team5 = new Team();
        team5.setName("Groupama-FDJ");
        team5.setNationality("France");

        Team team6 = new Team();
        team6.setName("Bora-Hansgrohe");
        team6.setNationality("Allemagne");

        Team team7 = new Team();
        team7.setName("Astana Qazaqstan");
        team7.setNationality("Kazakhstan");

        Team team8 = new Team();
        team8.setName("EF Education-EasyPost");
        team8.setNationality("États-Unis");

        Team team9 = new Team();
        team9.setName("AG2R Citroën Team");
        team9.setNationality("France");

        Team team10 = new Team();
        team10.setName("Team DSM");
        team10.setNationality("Allemagne");

        // Affichage des équipes
        List<Team> teams = Arrays.asList(team1, team2, team3, team4, team5, team6, team7, team8, team9, team10);
        for (Team team : teams) {
           tdao.create(team);
        }
    }}

