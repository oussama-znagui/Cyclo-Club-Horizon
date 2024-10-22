package ma.znagui.app.service.Impl;

import ma.znagui.app.entity.Cycliste;
import ma.znagui.app.service.CyclisteService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CyclisteServiceImpl extends GenericServiceImpl<Cycliste> implements CyclisteService{

    public CyclisteServiceImpl(){
        super(Cycliste.class);
    }


    public List<Cycliste> getCyclistsSortedByName() {
        return cDao.getCyclistsSortedByName();
    }
}

