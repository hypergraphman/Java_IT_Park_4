package ru.itpark.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itpark.app.forms.RegistrationForm;
import ru.itpark.app.models.Role;
import ru.itpark.app.models.State;
import ru.itpark.app.models.User;
import ru.itpark.app.repositories.UsersRepository;

import java.time.LocalDateTime;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void registrationUser(RegistrationForm form) {
        User newUser = User.builder()
                .email(form.getEmail())
                .registrationDate(LocalDateTime.now())
                .hashPassword(passwordEncoder.encode(form.getPassword()))
                .state(State.CONFIRMED)
                .role(Role.STUDENT)
                .build();

        usersRepository.save(newUser);
    }
}
