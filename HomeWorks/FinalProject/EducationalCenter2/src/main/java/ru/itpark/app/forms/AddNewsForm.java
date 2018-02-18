package ru.itpark.app.forms;

import lombok.Data;
import ru.itpark.app.models.User;

@Data
public class AddNewsForm {
    private String title;
    private String text;
    private User user;
}
