package de.inmed.keycloakloginmodule.adapter.web.auth.service;

import de.inmed.keycloakloginmodule.adapter.web.auth.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class DefaultUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println();
        if (username.equals("Stefan")) {
            User user = new User("Stefan");
            user.setPassword("test123");

            return new DefaultUserDetails(user);
        }

        throw new UsernameNotFoundException("Nicht gefunden");
    }
}
