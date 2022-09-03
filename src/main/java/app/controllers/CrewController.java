package app.controllers;

import app.models.Crew;
import app.repositories.CrewRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CrewController {
    private final CrewRepo crewRepo;

    public CrewController(CrewRepo crewRepo) {
        this.crewRepo = crewRepo;
    }

    @GetMapping("/allCrewMember")
    public String allMember(Model model){

        List<Crew> crewList = (List<Crew>) crewRepo.findAll();
        model.addAttribute("crewList",crewList);
        return "crewdatas";
    }
    @GetMapping("/allCrewMember/{search}")
    public String searchByName(
            @PathVariable String search,
            Model model){

        List<Crew> crewList = (List<Crew>) crewRepo.findAll();
        model.addAttribute("crewList",crewList);
        return "crewdatas";
    }
}
