package ma.znagui.app.controller;

import ma.znagui.app.dto.CompetitionDTO;
import ma.znagui.app.exeption.ResourceNotFoundException;
import ma.znagui.app.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/competition")
public class CompetitionController {

@Autowired
CompetitionService competitionService;

@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CompetitionDTO> getOne(@PathVariable("id") int id) throws IOException {

    CompetitionDTO competitionDTO = competitionService.findOne(id)
            .orElseThrow(() -> new ResourceNotFoundException("Competition with ID " + id + " not found"));

    return ResponseEntity.ok(competitionDTO);
}

@GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CompetitionDTO>> getAll(){
    return ResponseEntity.ok(competitionService.findAll());
}
}
