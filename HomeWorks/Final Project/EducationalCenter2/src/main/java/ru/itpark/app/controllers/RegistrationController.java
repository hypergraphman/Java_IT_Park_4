package ru.itpark.app.controllers;

import org.postgresql.util.PSQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.app.forms.RegistrationForm;
import ru.itpark.app.models.User;
import ru.itpark.app.repositories.UsersRepository;
import ru.itpark.app.services.ProfileService;
import ru.itpark.app.services.RegistrationService;

@Controller
public class RegistrationController {
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private RegistrationService service;

    @Autowired
    private ProfileService profileService;

    @GetMapping("/users")
    public String getUserPage(@ModelAttribute("model") ModelMap modelMap,
                              Authentication authentication) {
        modelMap.addAttribute("users", usersRepository.findAll());
        User user = profileService.getUserInformation(authentication);
        modelMap.addAttribute("user", user);
        return "users_page";
    }

    @GetMapping("/signIn")
    public String getSignInPage(@ModelAttribute("model") ModelMap model,
                                @RequestParam(value = "error", required = false) String error) {
        if (error != null) {
            model.addAttribute("error", true);
        }
        return "sign_in";
    }


    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "sign_up";
    }

    @PostMapping("/signUp")
    public String registrationUser(@ModelAttribute RegistrationForm form) {

        try {
            service.registrationUser(form);
            return "success_sign_up";
        } catch (Exception e) {
            return "unsuccess_sign_up";
        }
    }
}
