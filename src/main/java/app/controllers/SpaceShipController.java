package app.controllers;

import app.models.Crew;
import app.models.SpaceShip;
import app.models.SpaceShipClass;
import app.repositories.CrewRepo;
import app.repositories.SpaceShipRepo;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SpaceShipController {

    private final  SpaceShipRepo spaceShipRepo;

    private final CrewRepo crewRepo;

    public SpaceShipController(SpaceShipRepo spaceShipRepo,CrewRepo crewRepo) {
        this.spaceShipRepo = spaceShipRepo;
        this.crewRepo = crewRepo;
    }

    @GetMapping(value = {"/spaceship"})
    public String saveNewSpaceShip(Model model) {
        model.addAttribute("newShip", new SpaceShip());
        model.addAttribute("shipClasses", SpaceShipClass.values());

        return "spaceship_new";
    }

    @GetMapping("/spaceshiplist")
    public String Task1(Model model){
        List<SpaceShip> spaceShipList = (List<SpaceShip>) spaceShipRepo.findAll();
        model.addAttribute("spaceshiplists",spaceShipList);
        return "spaceships";
    }
    @GetMapping("/spaceshipisactive")
    public String Task2(Model model){
        List<SpaceShip> spaceShipList = spaceShipRepo.findSpaceShipByIsActiveTrue();
        model.addAttribute("spaceshipisactive",spaceShipList);
        return "spaceshipisactive";
    }


    @GetMapping("/spaceshipList/{search}")
    public String Task3(
            @PathVariable int registrationCode,
            Model model){
        List<Crew> crewList = (List<Crew>) crewRepo.findAll();
        model.addAttribute("crewdata",crewList);
        return "crewdatas";
    }



}
