package de.inmed.keycloakloginmodule.adapter.web.auth;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class User {

    private String name = "";
    private String password = "";

    public User(String name) {
        this.name = name;
    }


}
