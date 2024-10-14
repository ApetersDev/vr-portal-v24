package de.apeters.vrportalv24.services;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.Endpoint;
import de.apeters.vrportalv24.data.User;
import de.apeters.vrportalv24.security.AuthenticatedUser;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

@Endpoint
@AnonymousAllowed
public class UserEndpoint {

    @Autowired
    private AuthenticatedUser authenticatedUser;

    public Optional<User> getAuthenticatedUser() {
        return authenticatedUser.get();
    }
}
