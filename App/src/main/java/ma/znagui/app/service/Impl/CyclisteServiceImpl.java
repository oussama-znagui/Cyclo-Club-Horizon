package ma.znagui.app.service.Impl;

import ma.znagui.app.dao.CyclisteDao;
import ma.znagui.app.dto.CyclisteCreateAndUpdateDTO;
import ma.znagui.app.dto.CyclisteDTO;
import ma.znagui.app.entity.Cycliste;
import ma.znagui.app.entity.Team;
import ma.znagui.app.mapper.CyclisteMapper;
import ma.znagui.app.service.CyclisteService;
import org.mapstruct.Mapper;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

@Service
public class CyclisteServiceImpl  implements CyclisteService{

    @Autowired
    protected CyclisteDao dao;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CyclisteMapper mapper;

//---------------------------------------------------------------------------------------------------------

    public Optional<CyclisteDTO> findOne(long id) {
        Optional<Cycliste> cycliste = dao.findOne(id);
        if(cycliste.isPresent()){
          CyclisteDTO cdto =   modelMapper.map(cycliste.get(), CyclisteDTO.class);
            return Optional.of(cdto);
        }else {
            return Optional.empty();

        }
    }

//---------------------------------------------------------------------------------------------------------


    public List<CyclisteDTO> findAll() {
        List<Cycliste> cyclistes = dao.findAll();

        Type listType = new TypeToken<List<CyclisteDTO>>(){}.getType();
        List<CyclisteDTO> postDTOList = modelMapper.map(cyclistes, listType);
        return postDTOList;
    }

//---------------------------------------------------------------------------------------------------------



    public CyclisteDTO create(CyclisteCreateAndUpdateDTO dto) {
        Cycliste c = mapper.createAndUpdateDTOtoCycliste(dto);
//        Cycliste c2 = mapper.createAndUpdateDTOtoCycliste(dto);
        System.out.println("thiiis" + c.toString());
//
//        System.out.println("avant " + c2.getTeam().getName());
//
        Cycliste created =  dao.create(c);
//        Team t = new Team();
        created = dao.findOne(created.getId()).orElseThrow(() -> new RuntimeException("Cycliste not found"));

        System.out.println(created.getTeam().getName());

        CyclisteDTO cdto =   mapper.cyclisteToCyclisteDTO(created);
////        System.out.println("from service " + c1);
//        CyclisteDTO cDTO = mapper.cyclisteToCyclisteDTO(created);


//        Cycliste cycliste = new Cycliste("said","radi",22);
//Team t = new Team();
//t.setId(960);



        return cdto ;
    }

//---------------------------------------------------------------------------------------------------------


    public CyclisteDTO update(CyclisteCreateAndUpdateDTO dto,int id) {




        Cycliste c = mapper.createAndUpdateDTOtoCycliste(dto);
        c.setId(id);
        Cycliste updated =  dao.update(c);
        System.out.println(updated.toString());
        CyclisteDTO cdto =   mapper.cyclisteToCyclisteDTO(updated);
        return cdto;




    }

//---------------------------------------------------------------------------------------------------------


    public void delete(int id) {
        dao.delete(id);


    }

//---------------------------------------------------------------------------------------------------------


    public List<CyclisteDTO> getCyclistsSortedByName() {
        return List.of();
    }

//    public List<Cycliste> getCyclistsSortedByName() {
//        return cDao.getCyclistsSortedByName();
//    }
}

