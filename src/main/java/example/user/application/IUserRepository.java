package example.user.application;

import java.util.List;
import java.util.UUID;

import org.soulspace.overarch.java.OverarchNode;

import example.user.domain.User;

/**
 * Interface for user repository implementations.
 */
@OverarchNode(el = "interface", id = "example.user.application/i-user-repository")
public interface IUserRepository {

    /**
     * Finds users by their attributes.
     * 
     * @param firstName
     * @param lastName
     * @param email
     * 
     * @return list of users
     */
    public List<User> findUsers(String firstName, String lastName, String email);

    /**
     * Gets the list of users.
     * 
     * @return list of users
     */
    public List<User> getUsers();
    
    /**
     * Returns the user with the given id.
     * 
     * @param id
     * @return
     */
    public User getUser(UUID id);
    
    /**
     * Adds a user with the given attributes.
     * @param user
     * @return the added user
     */
    public User addUser(User user);
    
    /**
     * Removes the user with the given id.
     * @param id
     * @return true, if the user was successfully removed, false otherwise
     */
    public boolean removeUser(UUID id);
}
