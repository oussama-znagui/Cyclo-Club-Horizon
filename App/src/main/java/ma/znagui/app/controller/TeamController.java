package ma.znagui.app.controller;

import ma.znagui.app.entity.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @GetMapping
    public String getTeam() {
        System.out.println("bonjour");

        return "alooo";
    }
}
