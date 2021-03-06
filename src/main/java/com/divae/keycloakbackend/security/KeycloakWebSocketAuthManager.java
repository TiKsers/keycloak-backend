/*
package com.divae.keycloakbackend.security;

import com.divae.keycloakbackend.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.keycloak.common.VerificationException;
import org.keycloak.representations.AccessToken;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@Qualifier("websocket")
@AllArgsConstructor
public class KeycloakWebSocketAuthManager implements AuthenticationManager {
    private final KeycloakTokenVerifier tokenVerifier;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        JWSAuthentificationToken token = (JWSAuthentificationToken) authentication;
        String tokenString = (String) token.getCredentials();
        try {
            AccessToken accesToken = tokenVerifier.verifyToken(tokenString);
            List<GrantedAuthority> authorities = accessToken.getRealmAccess().getRoles().stream()
                    .map(SimpleGrantedAuthority::new).collect(Collectors.toList());
            User user = new User(accessToken.getName(), accessToken.getEmail(), accessToken.getPreferredUsername(),
                    accessToken.getRealmAccess().getRoles());
            token = new JWSAuthenticationToken(tokenString, user, authorities);
            token.setAuthenticated(true);
        } catch (VerificationException e) {
            log.debug("Exception authenticating the token {}:", tokenString, e);
            throw new BadCredentialsException("Invalid token");
        }
        return token;
    }
}
*/
