package ru.itpark.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import ru.itpark.app.forms.AddNewsForm;
import ru.itpark.app.models.News;
import ru.itpark.app.models.User;
import ru.itpark.app.repositories.NewsRepository;
import ru.itpark.app.repositories.UsersRepository;

import java.time.LocalDateTime;

@Service
public class AddNewsServiceImpl implements AddNewsService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public void addNews(Authentication authentication, AddNewsForm form) {
        User user = usersRepository.findByEmail(authentication.getName()).get();
        News newNews = News.builder()
                .title(form.getTitle())
                .text(form.getText())
                .user(user)
                .newsDateTime(LocalDateTime.now())
                .build();

        newsRepository.save(newNews);
    }
}
