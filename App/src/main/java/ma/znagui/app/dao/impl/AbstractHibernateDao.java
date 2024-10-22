package ma.znagui.app.dao.impl;

import com.google.common.base.Preconditions;
import ma.znagui.app.dao.GenericDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Repository
public abstract class AbstractHibernateDao<T extends Serializable> implements GenericDao<T> {

    private Class<T> clazz;
    @Autowired
    protected SessionFactory sessionFactory;

    public AbstractHibernateDao(Class<T> className) {
        clazz = className;
    }

    public void setClazz(final Class<T> clazzToSet) {
        clazz = Preconditions.checkNotNull(clazzToSet);
    }
    //----------------------------------------------------------------------------------
    public Optional<T> findOne(final long id) {
        Session s = sessionFactory.openSession();

        return Optional.of((T) s.get(clazz, id));
    }
    //----------------------------------------------------------------------------------
    public List<T> findAll() {
        Session s = sessionFactory.openSession();
        return s.createQuery("from " + clazz.getName()).list();
    }
    //----------------------------------------------------------------------------------
    public T create(final T entity) {
        Session s = sessionFactory.openSession();
        Transaction t = s.beginTransaction();
        try { s.persist(entity); t.commit();
        }catch (Exception e){
            if (t != null){ t.rollback();
            }
            new RuntimeException("bonjour"  + e.getMessage());
        }finally {
            if(s != null){ s.close(); } } return entity;
    } //----------------------------------------------------------------------------------
    public T update(final T entity) {
        Preconditions.checkNotNull(entity);
        Session s = sessionFactory.openSession();
        Transaction t = s.beginTransaction();
        try { s.merge(entity); t.commit();
        }catch (Exception e){
            if (t != null){
                t.rollback();
            } new RuntimeException("bonjour"  + e.getMessage());
        }finally {
            if(s != null){ s.close();
            }
        }
        return entity; }
    //----------------------------------------------------------------------------------

  public void delete(final T entity){

//      Preconditions.checkNotNull(entity);
      Session s = sessionFactory.openSession();
      Transaction t = s.beginTransaction();
      try {

          s.remove(s.contains(entity) ? entity : s.merge(entity));
          System.out.println("deleted");
          t.commit();

      }catch (Exception e){
          if (t != null){
              t.rollback();
          }
          new  RuntimeException("bonjour"  + e.getMessage());
      }finally {
          if(s != null){ s.close();
          }

      }

  }
}
