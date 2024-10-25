package ma.znagui.app.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface GenericService<DTO,DTOres,T>   {
    void setClazz(Class< T > clazzToSet);

    Optional<DTOres> findOne(final long id);

    List<DTOres> findAll();

    DTO create(final DTO entity);

    DTO update(final DTO entity);

    void delete(final DTO entity);
}
