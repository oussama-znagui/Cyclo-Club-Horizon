package ma.znagui.app.controller;

import ma.znagui.app.dto.PhaseCreateAndUpdateDto;
import ma.znagui.app.dto.PhaseDto;
import ma.znagui.app.dto.PhaseResultCreateDto;
import ma.znagui.app.dto.PhaseResultDto;
import ma.znagui.app.service.PhaseResultService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/phase-result")

public class PhaseResultController {
    @Autowired
    PhaseResultService service;

    @PostMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PhaseResultDto> create(@RequestBody PhaseResultCreateDto dto) {
        try {
            return ResponseEntity.ok(service.create(dto));
        }catch (Exception e) {
            return new ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
