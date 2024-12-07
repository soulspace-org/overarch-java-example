package example.user.adapter;

import org.soulspace.overarch.java.OverarchNode;

import example.user.application.UserService;

/**
 * This is the REST service for dummies.
 */
@OverarchNode(el = "class" /*, id = "my/id" */)
public class RestAdapter {
    UserService userService;

}