package de.inmed.keycloakloginmodule.adapter.web.auth.service;

import de.inmed.keycloakloginmodule.adapter.web.auth.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInfo {

    User user = null;

    public Optional<User> getUser() {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();
        String name = authentication.getName();

        if (name.equals("Stefan")) {
            user = new User("Stefan");
        }

        if (user == null) {
            return Optional.empty();
        }

        return Optional.of(user);
    }
}
