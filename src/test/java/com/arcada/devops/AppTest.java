package com.arcada.devops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
	
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    public void testGetFriendListOfUser() {
    	System.out.println("Running testGetFriendList");
    	
    	String[] expectedFriends = {"David Rodriguez", "Jessica Moore", "Michael Brown"};
        String[] actualFriends = App.getFriendListOfUser("Linda Anderson");
        // Assert that the method returns the expected friend list
        assertArrayEquals(expectedFriends, actualFriends, "Should return matching friend list");
    }
    
    @Test
    void testGetFriendListOfNonExistentUser() {
        String[] expectedError = {"ERROR: User profile is inaccessible or does not exist."};
        String[] actualError = App.getFriendListOfUser("Joe Null");
        assertArrayEquals(expectedError, actualError, "Should return non-existent user error");
    }
    
}
