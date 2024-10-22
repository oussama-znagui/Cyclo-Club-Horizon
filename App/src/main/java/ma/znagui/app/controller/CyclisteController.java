package ma.znagui.app.controller;


import ma.znagui.app.dao.CyclisteDao;
import ma.znagui.app.entity.Cycliste;
import ma.znagui.app.service.CyclisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cyclists")
public class CyclisteController {
    @Autowired
   private  CyclisteDao cyclisteService;

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

    @GetMapping(value = "/a", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Cycliste>> getAll() {
        List<Cycliste> cyclists = cyclisteService.findAll();
        return ResponseEntity.ok(cyclists);
    }
}
