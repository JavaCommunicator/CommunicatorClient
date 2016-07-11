package b.Impl;

import b.UserService;
import c.types.UserStatus;
import d.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Michal Czarnecki on 11.07.2016.
 */
public class UserServiceImplTest {

    //TODO: later change to Mockito
    UserService userService = new UserServiceImpl();

    User user1 = new User(1, UserStatus.AVAILABLE, "nickname");
    User user2 = new User(2, UserStatus.AWAY, "mickname");


    //Think about making it clearer
    @Test
    public void sortTwoUsersTest() throws Exception{
        List<User> users = new ArrayList<User>();
        users.add(user2);
        users.add(user1);

        List<User> sortedUsers = new ArrayList<User>();
        sortedUsers.add(user1);
        sortedUsers.add(user2);

        userService.sortUsers(users);

        assertEquals(users, sortedUsers);
        assertEquals(user1, users.get(0));

    }

}