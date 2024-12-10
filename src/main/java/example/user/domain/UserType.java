package example.user.domain;

import org.soulspace.overarch.java.OverarchNode;

/**
 * Represents the type of the user.
 */
@OverarchNode()
public enum UserType {
    
    /** Standard user */
    STANDARD,
    
    /** Important user */
    VIP,

    /** Administrator user */
    ADMIN;
}
