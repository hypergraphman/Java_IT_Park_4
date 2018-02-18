package ru.itpark.app.services;

import org.springframework.security.core.Authentication;
import ru.itpark.app.forms.AddNewsForm;

public interface AddNewsService {
    void addNews(Authentication authentication, AddNewsForm form);
}
