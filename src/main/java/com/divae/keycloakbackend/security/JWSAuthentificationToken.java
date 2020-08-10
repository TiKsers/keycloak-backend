package com.divae.keycloakbackend.security;

import com.divae.keycloakbackend.User;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import javax.security.auth.Subject;
import java.util.Collection;

public class JWSAuthentificationToken extends AbstractAuthenticationToken implements Authentication {
    private static final long serialVersionUID = 1L;

    private String token;
    private User principal;

    public JWSAuthentificationToken(String token) {
        this(token, null, null);
    }

    public JWSAuthentificationToken(String token, User principal, Collection<GrantedAuthority> authorities) {
        super(authorities);
        this.token = token;
        this.principal = principal;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

    @Override
    public Object getPrincipal() {
        return principal;
    }
}
