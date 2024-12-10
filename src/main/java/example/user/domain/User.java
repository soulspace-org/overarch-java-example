package example.user.domain;

import java.util.UUID;

import org.soulspace.overarch.java.OverarchNode;

/**
 * User entity
 */
@OverarchNode(tags = {"aggregate", "entity"})
public class User {

    /** Id of the user. */
    UUID id;

    /** First name of the user. */
    String firstName;

    /** Last name of the user. */
    String lastName;

    /** Email of the user. */
    EMail email;

}
