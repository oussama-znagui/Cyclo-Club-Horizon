package ma.znagui.app.controller;

import ma.znagui.app.dto.*;
import ma.znagui.app.entity.PhaseResult;
import ma.znagui.app.entity.PhaseResultKey;
import ma.znagui.app.exeption.ResourceNotFoundException;
import ma.znagui.app.service.PhaseResultService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phase-result")

public class PhaseResultController {
    @Autowired
    PhaseResultService service;

    @PostMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PhaseResultDto> create(@RequestBody PhaseResultCreateDto dto) {
        try {
            System.out.println("allo");

            return ResponseEntity.ok(service.create(dto));
        }catch (Exception e) {
            return new ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PhaseResultDto>> getAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = "/{idC}/{idP}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PhaseResultDto> getOne(@PathVariable("idC") int idC,@PathVariable("idP") int idP){
        PhaseResultDto ph = service.findOne(idC,idP).orElseThrow(() -> new ResourceNotFoundException("Result   not found"));;
        return ResponseEntity.ok(ph);
    }

    @PatchMapping(value = "/",produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PhaseResultDto> addTimeToResult(@RequestBody PhaseResultAddTimeDTO dto){


            return ResponseEntity.ok(service.addTimeToResult(dto));




    }
}
