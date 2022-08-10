package com.sample;

import com.sample.models.Employee;
import com.sample.models.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserManagerTest {

    @Test
    public void addUser(Employee user1) {
        UserManager userManager = new InMemoryStorageUserManager();
        userManager.addUser(new Employee(1,"ad",500));
        assertEquals(0, userManager.listUsers().size());
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void listUsers() {
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void searchUsers() {
    }
}