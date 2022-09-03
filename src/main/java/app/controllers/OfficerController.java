package app.controllers;

import app.models.Officer;
import app.repositories.OfficerRepo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OfficerController {


    private final OfficerRepo officerRepo;

    public OfficerController(OfficerRepo officerRepo) {
        this.officerRepo = officerRepo;
    }

    @GetMapping("/login")
    public String viewHomePage() {
        return "login";
    }
    @GetMapping("/register")
    public String showSignUpForm(Model model) {
        model.addAttribute("user", new Officer());
        return "signup_form";
    }
    @PostMapping("/process-register")
    public String processRestration(Officer user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        officerRepo.save(user);
        return "register_success";
    }
}
