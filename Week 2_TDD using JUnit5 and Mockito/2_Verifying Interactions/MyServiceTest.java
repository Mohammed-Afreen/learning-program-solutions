package com.example.service;

import com.example.api.ExternalApi;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Creating a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Injecting mock into the service
        MyService service = new MyService(mockApi);

        // Calling the method under test
        service.fetchData();

        // Verifying interaction with mock
        verify(mockApi).getData();
    }
}
