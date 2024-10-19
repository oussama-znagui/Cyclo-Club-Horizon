package ma.znagui.app.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface GenericDao<T extends Serializable>  {
    void setClazz(Class< T > clazzToSet);

    Optional<T> findOne(final long id);

    List<T> findAll();

    T create(final T entity);

    T update(final T entity);

   void delete(final T entity);

}
