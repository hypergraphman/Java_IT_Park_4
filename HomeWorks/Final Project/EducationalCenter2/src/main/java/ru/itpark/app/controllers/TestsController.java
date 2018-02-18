package ru.itpark.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itpark.app.models.User;
import ru.itpark.app.repositories.UsersRepository;
import ru.itpark.app.services.ProfileService;
import ru.itpark.app.services.RegistrationService;

@Controller
public class TestsController {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private RegistrationService service;

    @Autowired
    private ProfileService profileService;

    @GetMapping("/tests")
    public String getTestsPage(@ModelAttribute("model") ModelMap modelMap,
                              Authentication authentication) {
        modelMap.addAttribute("users", usersRepository.findAll());
        User user = profileService.getUserInformation(authentication);
        modelMap.addAttribute("user", user);
        return "tests";
    }

    @PostMapping("/tests")
    public String postTestPage() {
        return "tests";
    }
}
