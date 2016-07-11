package b.Impl;

import b.UserService;
import d.User;

import java.util.Collections;
import java.util.List;

/**
 * Created by Michal Czarnecki on 11.07.2016.
 */
public class UserServiceImpl implements UserService{

    public void sortUsers(List<User> users) {
        Collections.sort(users, (User u1, User u2) -> u2.compareTo(u1));
    }
}
