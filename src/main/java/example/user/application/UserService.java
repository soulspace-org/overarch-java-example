package example.user.application;

import java.util.UUID;

import org.soulspace.overarch.java.OverarchNode;

import example.user.domain.User;

/**
 * Implements the use cases of the user management component
 */
@OverarchNode(el = "class" /*, id = "my/id" */)
public class UserService {
    public User createUser(String firstname, String lastName, String email) {
        // TODO implement
        return null;
    };

    public boolean deleteUser(UUID id) {
        // TODO implement
        return false;
    };
}
