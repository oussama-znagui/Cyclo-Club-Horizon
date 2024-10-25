package ma.znagui.app.controller;


import ma.znagui.app.dao.CyclisteDao;
import ma.znagui.app.dto.CyclisteCreateAndUpdateDTO;
import ma.znagui.app.dto.CyclisteDTO;
import ma.znagui.app.entity.Cycliste;
import ma.znagui.app.service.CyclisteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/cyclists")
public class CyclisteController {
    @Autowired
   private  CyclisteService cyclisteService;

    @Autowired
    private ModelMapper modelMapper;

//    @RequestMapping(value = "/a", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<Cycliste>> getAll() {
//        Cycliste c1 = new Cycliste();
//        c1.setAge(12);
//        c1.setFirstName("allo");
//        List<Cycliste> Lc = new ArrayList<>();
//        Lc.add(c1);
//
//        return ResponseEntity.ok().body(Lc);
//    }

//    @GetMapping(value = "/a", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<CyclisteDTO>> getAll() {
//
//
////        List<Cycliste> cyclists = cyclisteService.findAll();
////        return ResponseEntity.ok(cyclists);
//    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CyclisteDTO> getCyclisteById(@PathVariable("id") int id){
        Optional<CyclisteDTO> c = cyclisteService.findOne(id);
//        CyclisteDTO cDTO = modelMapper.map(c.get(),CyclisteDTO.class);
        return ResponseEntity.ok(c.get());

    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CyclisteDTO>> getAll(){
        List<CyclisteDTO> cyclisteDTOS = cyclisteService.findAll();

        return ResponseEntity.ok(cyclisteDTOS);

    }


    @PostMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CyclisteDTO> add(@RequestBody CyclisteCreateAndUpdateDTO dto){
        try{
            return ResponseEntity.ok(cyclisteService.create(dto));
        } catch (Exception e) {
            return new ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PutMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CyclisteDTO> update(@RequestBody CyclisteCreateAndUpdateDTO dto,@PathVariable("id") int id){
       try {
           return ResponseEntity.ok(cyclisteService.update(dto,id));
       } catch (Exception e) {
           return new ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
       }

    }


    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> delete(@PathVariable("id") int id){
        try {
            cyclisteService.delete(id);
            return ResponseEntity.ok("Cycliste deleted");
        }catch (Exception e) {
            return new ResponseEntity<>("Not found" , HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
