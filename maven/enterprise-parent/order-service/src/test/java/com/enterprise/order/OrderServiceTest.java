package com.enterprise.order;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {
    @Test
    public void testServiceName() {
        OrderService service = new OrderService();
        assertEquals("Order Service", service.getServiceName());
    }
}