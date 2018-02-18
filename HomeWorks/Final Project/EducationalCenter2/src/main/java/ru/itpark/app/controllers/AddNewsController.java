package ru.itpark.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itpark.app.forms.AddNewsForm;
import ru.itpark.app.repositories.NewsRepository;
import ru.itpark.app.services.AddNewsService;
import ru.itpark.app.services.ProfileService;

@Controller
public class AddNewsController {

    @Autowired
    private AddNewsService service;

    @Autowired
    private ProfileService profileService;

    @GetMapping("/news/add")
    public String getAddNewsPage(@ModelAttribute("model") ModelMap modelMap) {
        return "add_news";
    }

    @PostMapping("/news/add")
    public String addNews(Authentication authentication, @ModelAttribute AddNewsForm form) {
        service.addNews(authentication, form);
        return "added_news";
    }
}
