package d;

import c.types.UserStatus;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michal Czarnecki on 11.07.2016.
 */
public class UserTest {
    
    @Test
    public void compareTwoAvailableUsersTest() throws Exception{
        User user1 = new User(1, UserStatus.AVAILABLE, "Mike");
        User user2 = new User(2, UserStatus.AVAILABLE, "John");

        int result = user1.compareTo(user2);
        assertEquals(3, result);
    }

    @Test
    public void compareTwoAvailableUsersTestReversed() throws Exception{
        User user1 = new User(1, UserStatus.AVAILABLE, "Mike");
        User user2 = new User(2, UserStatus.AVAILABLE, "John");
        int result = user2.compareTo(user1);
        assertEquals(-3, result);
    }

}