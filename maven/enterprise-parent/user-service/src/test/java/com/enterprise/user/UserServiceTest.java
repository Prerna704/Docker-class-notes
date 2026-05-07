package com.enterprise.user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {
    @Test
    public void testServiceName() {
        UserService service = new UserService();
        assertEquals("User Service", service.getServiceName());
    }
}
