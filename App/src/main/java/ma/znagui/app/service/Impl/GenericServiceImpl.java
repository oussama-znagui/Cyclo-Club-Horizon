//package ma.znagui.app.service.Impl;
//
//import com.google.common.base.Preconditions;
//import ma.znagui.app.dao.CyclisteDao;
//import ma.znagui.app.dao.GenericDao;
//import ma.znagui.app.service.GenericService;
//import org.hibernate.SessionFactory;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//
//import java.io.Serializable;
//import java.util.List;
//import java.util.Optional;
//@Service
//public abstract class GenericServiceImpl<DTO,DTOres,T> implements GenericService<DTO,DTOres,T> {
//
//    private Class<T> clazz;
//    protected GenericDao dao;
//
//
//    @Autowired
//    private ModelMapper modelMapper;
//
//    public GenericServiceImpl(@Qualifier("abstractHibernateDao") GenericDao dao){
//
//        this.dao = dao;
//
//    }
//
//
//    public void setClazz(final Class<T> clazzToSet) {
//        clazz = Preconditions.checkNotNull(clazzToSet);
//    }
//
//
//    @Override
//    public Optional<DTOres> findOne(long id) {
//       Optional<T> T=  dao.findOne(id);
//       if(T.isPresent()){
//           DTOres dtoRes = modelMapper.map(T.get(), DTOres);
//           return Optional.of(dtoRes);
//       }else {
//         return   Optional.empty();
//       }
//
//
//
//    }
//
//    @Override
//    public List<DTOres> findAll() {
//        return List.of();
//    }
//
//    @Override
//    public DTO create(DTO entity) {
//        return null;
//    }
//
//    @Override
//    public DTO update(DTO entity) {
//        return null;
//    }
//
//    @Override
//    public void delete(DTO entity) {
//
//    }
//}
