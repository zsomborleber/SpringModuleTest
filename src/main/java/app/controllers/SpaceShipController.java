package app.controllers;

import app.models.Crew;
import app.models.SpaceShip;
import app.models.SpaceShipClass;
import app.repositories.CrewRepo;
import app.repositories.SpaceShipRepo;
import app.services.SpaceShipService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SpaceShipController {
    private final SpaceShipService spaceShipService;

    private final  SpaceShipRepo spaceShipRepo;

    private final CrewRepo crewRepo;

    public SpaceShipController(SpaceShipRepo spaceShipRepo,CrewRepo crewRepo,SpaceShipService spaceShipService) {
        this.spaceShipRepo = spaceShipRepo;
        this.crewRepo = crewRepo;
        this.spaceShipService = spaceShipService;
    }

    @GetMapping(value = {"/spaceship"})
    public String saveNewSpaceShip(Model model,SpaceShip spaceShip) {
        model.addAttribute("newShip", new SpaceShip());
        model.addAttribute("shipClasses", SpaceShipClass.values());
        return "spaceship_new";
    }


    @PostMapping(value = "/spaceship")
    public String saveNewSpaceShip (SpaceShip newShip) {
        newShip.setActive(true);
        spaceShipRepo.save(newShip);
        return "redirect:/spaceshiplist";
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


   /*
   3.: Feladat

   Itt a BÓNUSZ 1-et kérném pontozni,
   valamiért a repoval nem tudtam ennél a feladatnál összehozni:(
   (.UnsatisfiedDependencyException) e miatt



   @GetMapping("/spaceshipList/{search}")
    public String Task3(
            @PathVariable int registrationCode,
            Model model){
        List<Crew> crewList = (List<Crew>) crewRepo.findAll();
        model.addAttribute("crewdata",crewList);
        return "crewdatas";
    }*/




}
