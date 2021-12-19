package de.inmed.keycloakloginmodule.adapter.web;

import de.inmed.keycloakloginmodule.adapter.web.auth.User;
import de.inmed.keycloakloginmodule.adapter.web.auth.exceptions.NoPermissionException;
import de.inmed.keycloakloginmodule.adapter.web.auth.service.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SomeController {
    
    private final UserInfo userInfo;

    @GetMapping("/about")
    public String about() {
        return "Einige Infos über diese Webseite";
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "Hallo " + getAuthenticatedUser().getName();
    }

    public User getAuthenticatedUser() {
        return userInfo.getUser().orElseThrow(NoPermissionException::new);
    }


}
