package ma.znagui.app.service.Impl;

import com.google.common.base.Preconditions;
import ma.znagui.app.dao.CyclisteDao;
import ma.znagui.app.service.GenericService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
@Service
public class GenericServiceImpl<T extends Serializable> implements GenericService<T> {

    private Class<T> clazz;
    @Autowired
    protected CyclisteDao cDao;

    public GenericServiceImpl(Class<T> className) {
        clazz = className;
    }
    public GenericServiceImpl(){}


    public void setClazz(final Class<T> clazzToSet) {
        clazz = Preconditions.checkNotNull(clazzToSet);
    }
    @Override
    public Optional<T> findOne(long id) {
        return Optional.empty();
    }

    @Override
    public List<T> findAll() {
        return List.of();
    }

    @Override
    public T create(T entity) {
        return null;
    }

    @Override
    public T update(T entity) {
        return null;
    }

    @Override
    public void delete(T entity) {

    }
}
