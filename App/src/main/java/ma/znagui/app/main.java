package ma.znagui.app;

import ma.znagui.app.entity.Competition;
import ma.znagui.app.entity.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

public class main {
    public static void main(String args[]){


        System.out.println("bonjour");

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        SessionFactory sf =  context.getBean(SessionFactory.class);

        Session s = null;
        Transaction t = null;
        try {
            s = sf.openSession();
            t =  s.beginTransaction();
            Team team = new Team();
            team.setName("allo");
            team.setNationality("morocco");



            s.persist(team);
            t.commit();
        }catch (Exception e){
            t.rollback();
            throw new RuntimeException("rien");
        }

//
//
//
//        s.close();
//
//
//
    }
}
