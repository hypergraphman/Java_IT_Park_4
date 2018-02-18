package ru.itpark.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.itpark.app.repositories.NewsRepository;
import ru.itpark.app.models.User;
import ru.itpark.app.services.ProfileService;

@Controller
public class NewsController {

    @Autowired
    private ProfileService profileService;

    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/news")
    public String getNewsPage(@ModelAttribute("model") ModelMap modelMap, Authentication authentication) {
        modelMap.addAttribute("news", newsRepository.findTop3ByTitleLikeOrderByNewsDateTimeDesc("%%"));
        User user = profileService.getUserInformation(authentication);
        modelMap.addAttribute("user", user);
        return "news_page";
    }
}
